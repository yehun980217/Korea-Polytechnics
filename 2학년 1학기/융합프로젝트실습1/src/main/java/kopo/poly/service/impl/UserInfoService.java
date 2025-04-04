package kopo.poly.service.impl;

import kopo.poly.dto.UserInfoDTO;
import kopo.poly.repository.UserInfoRepository;
import kopo.poly.repository.entity.UserInfoEntity;
import kopo.poly.service.IUserInfoService;
import kopo.poly.util.CmmUtil;
import kopo.poly.util.DateUtil;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserInfoService implements IUserInfoService {

    // 회원 관련 Repository
    private final UserInfoRepository userInfoRepository;

    @Override
    public UserInfoDTO getUserIdExists(@NonNull UserInfoDTO pDTO) throws Exception {
        log.info("{}.getUserIdExists Start!", this.getClass().getName());

        log.info("pDTO : {}", pDTO);

        String userId = CmmUtil.nvl(pDTO.userId());

        // DB에서 아이디 중복 여부 확인
        boolean exists = userInfoRepository.findByUserId(userId).isPresent();

        // 존재 여부에 따라 DTO 생성
        UserInfoDTO rDTO = UserInfoDTO.builder()
                .existsYn(exists ? "Y" : "N")
                .build();

        log.info("{}.getUserIdExists End!", this.getClass().getName());

        return rDTO;
    }

    @Override
    public int insertUserInfo(@NonNull UserInfoDTO pDTO) throws Exception {
        log.info("{}.insertUserInfo Start!", this.getClass().getName());

        log.info("pDTO : {}", pDTO); // Controller에서 값 전달 잘 되엇는 지 확인하기

        // 회원가입 성공 : 1, 아이디 중복으로인한 가입 취소 : 2, 기타 에러 발생 : 0
        int res;

        String userId = CmmUtil.nvl(pDTO.userId());
        String userName = CmmUtil.nvl(pDTO.userName());
        String password = CmmUtil.nvl(pDTO.password());
        String email = CmmUtil.nvl(pDTO.email());
        String addr1 = CmmUtil.nvl(pDTO.addr1());
        String addr2 = CmmUtil.nvl(pDTO.addr2());

        // 회원 가입 중복 방지를 위해 DB에서 데이터 조회
        Optional<UserInfoEntity> rEntity = userInfoRepository.findByUserId(userId);

        // 값이 존재한다면... (이미 회원가입된 아이디)
        if (rEntity.isPresent()) {
            res = 2;
        } else {
            // 회원가입을 위한 Entity 생성
            UserInfoEntity pEntity = UserInfoEntity.builder()
                    .userId(userId).userName(userName)
                    .password(password)
                    .email(email)
                    .addr1(addr1).addr2(addr2)
                    .regId(userId).regDt(DateUtil.getDateTime("yyyy-MM-dd hh:mm:ss"))
                    .chgId(userId).chgDt(DateUtil.getDateTime("yyyy-MM-dd hh:mm:ss"))
                    .build();

            // 회원정보 DB에 저장
            userInfoRepository.save(pEntity);

            // JPA의 save함수는 데이터 값에 따라 등록, 수정을 수행함
            // 물론 잘 저장되겠지만, 내가 실행한 save 함수가 DB에 등록이 잘 수행되었는 지 100% 확신이 불가능함
            // 회원 가입 후, 혹시 저장 안될 수 있기에 조회 수행함
            // 회원 가입 중복 방지를 위해 DB에서 데이터 조회
            res = userInfoRepository.findByUserId(userId).isPresent() ? 1 : 0;
        }

        log.info("{}.insertUserInfo End!", this.getClass().getName());

        return res;
    }

    /* 로그인을 위해 아이디와 비밀번호가 일치하는 지 확인하기
    *
    * @param pDTO 로그인을 위한 회원아이디, 비밀번호
    * @return 로그인된 회원아이디 정보
    * */

    @Override
    public int getUserLogin(@NonNull UserInfoDTO pDTO) throws Exception {
        log.info("{}.getUserLogin Start!", this.getClass().getName());

        String userId = CmmUtil.nvl(pDTO.userId());
        String password = CmmUtil.nvl(pDTO.password());

        log.info("userId : {}, password : {}", userId, password);

        // 로그인을 위해 아이디와 비밀번호가 일치하는 지 확인하기 위한 JPA 호출하기
        boolean res = userInfoRepository.findByUserIdAndPassword(userId, password).isPresent();

        log.info("{}.getUserLogin End!", this.getClass().getName());

        // 로그인 성공 : 1, 실패 : 0
        return res ? 1 : 0;
    }
}
