package kopo.poly.controller;

import jakarta.servlet.http.HttpSession;
import kopo.poly.dto.NoticeDTO;
import kopo.poly.repository.NoticeSQLRepository;
import kopo.poly.service.INoticeJoinService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequestMapping(value = "/notice")
@RequiredArgsConstructor
@Controller
public class NoticeJoinController {

    private final INoticeJoinService noticeJoinService;

    /*
    * 게시판 리스트 보여주기
    * <p>
    * GetMapping(value = "notice/noticeListUsingJoinColumn") =>
    * GET방식을 통해 접속되는 URL이 notice/noticeList 경우 아래 함수를 실행함
    * */
    @GetMapping(value = "noticeListUsingJoinColumn")
    public String noticeListUsingJoinColumn(HttpSession session, ModelMap model)
        throws Exception {

        // 로그 찍기(추후 찍은 로그를 통해 이 함수에 접근했는지 파악하기 용이하다.)
        log.info(this.getClass().getName() + ".noticeList Start!");

        // 로그인된 사용자 아이디는 Session에 저장함
        // 교육용으로 아직 로그인을 구현하지 않았기 때문에 Session에 데이터를 저장하지 않았음
        // 추후 로그인을 구현할 것으로 가정하고, 공지사항 리스트 출력하는 함수에서 로그인 한 것처럼 Session 값을 생성함
        session.setAttribute("SESSION_USER_ID", "USER01");

        // 공지사항 리스트 조회하기
        // Java 8부터 제공되는 Optional 활용하여 NPE(Null Pointer Exception) 처리
        List<NoticeDTO> rList = Optional.ofNullable(noticeJoinService.getNoticeListUsingJoinColumn())
                .orElseGet(ArrayList::new);

        // 조회된 리스트 결과값 넣어주기
        model.addAttribute("rList", rList);

        // 로그 찍기(추후 찍은 로그를 통해 이 함수 호출이 끝났는지 파악하기 용이하다.)
        log.info(this.getClass().getName() + ".noticeList End!");

        // 함수 처리가 끝나고 보여줄 HTML (Thymeleaf) 파일명
        // templates/notice/noticeList.html
        return "notice/noticeListJoin";

    }

    @GetMapping(value = "noticeListUsingNativeQuery")
    public String noticeListUsingNativeQuery(HttpSession session, ModelMap model) throws Exception {
        log.info(this.getClass().getName() + ".noticeListUsingNativeQuery Start!");

        session.setAttribute("SESSION_USER_ID", "USER01");

        List<NoticeDTO> rList = Optional.ofNullable(noticeJoinService.getNoticeListUsingNativeQuery())
                .orElseGet(ArrayList::new);

        model.addAttribute("rList", rList);

        log.info(this.getClass().getName() + ".noticeListUsingNativeQuery End!");

        return "notice/noticeListJoin";
    }

    @GetMapping(value = "noticeListUsingJPQL")
    public String noticeListUsingJPQL(HttpSession session, ModelMap model) throws Exception {

        log.info(this.getClass().getName() + ".noticeListUsingJPQL Start!");

        // 로그인된 사용자 아이디는 Session에 저장
        // 교육용으로 아직 로그인을 구현하지 않았기 때문에 Session에 데이터 저장 안함
        // 추후 구현할건데 지금은 로그인한것처럼 Session 생성함
        session.setAttribute("SESSION_USER_ID", "USER01");

        // 공지사항 리스트 조회하기
        // NPE 처리
        List<NoticeDTO> rList = Optional.ofNullable(noticeJoinService.getNoticeListUsingJPQL())
                .orElseGet(ArrayList::new);

        // 조회된 리스트 결과값 넣어주기
        model.addAttribute("rList", rList);

        log.info(this.getClass().getName() + ".noticeListUsingJPQL End!");

        return "notice/noticeListJoin";
    }

    @GetMapping(value = "noticeListUsingQueryDSL")
    public String noticeListUsingQueryDSL(HttpSession session, ModelMap model) throws Exception {

        // 로그 찍기(추후 찍은 로그를 통해 이 함수에 접근했는 지 파악하기 용이하다)
        log.info(this.getClass().getName() + ".noticeListUsingQueryDSL Start!");

        // 로그인된 사용자 아이디는 Session에 저장함
        // 교육용이라 아직 로그인 미구현 상태
        // 로그인이 있다는 가정하에 로그인한것처럼 Session 값 생성
        session.setAttribute("SESSION_USER_ID", "USER01");

        // 공지사항 리스트 조회하기
        // Java 8부터 제공되는 Optional 활용하여 NPE 처리
        List<NoticeDTO> rList = Optional.ofNullable(noticeJoinService.getNoticeListForQueryDSL())
                .orElseGet(ArrayList::new);

        // 조회된 리스트 결과값 넣어주기
        model.addAttribute("rList", rList);

        // 로그 찍기
        log.info(this.getClass().getName() + ".noticeListUsingQueryDSL End!");

        // 회원아이디가 아닌 회원이름 표시되는 공지사항 리스트 매핑
        // 함수 처리가 끝나고 보여줄 HTMl (Thymeleaf) 파일명
        // templates/notice/noticeList.html
        return "notice/noticeListJoin";
    }
}
