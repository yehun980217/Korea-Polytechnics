package kopo.poly.service.impl;

import kopo.poly.dto.StudentDTO;
import kopo.poly.mapper.IStudentMapper;
import kopo.poly.service.IStudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class StudentService implements IStudentService {

    private final IStudentMapper studentMapper;

    @Override
    public List<StudentDTO> insertStudent(StudentDTO pDTO) throws Exception {
        log.info(this.getClass().getName() + ".insertStudent Start!");

        Optional<StudentDTO> res = Optional.ofNullable(studentMapper.getStudent(pDTO));
        if(res.isEmpty()) {
            studentMapper.insertStudent(pDTO);
        }

        List<StudentDTO> rList = Optional.ofNullable(studentMapper.getStudentList()).orElseGet(ArrayList::new);

        log.info(this.getClass().getName() + ".insertStudent End!");

        return rList;
    }

    @Override
    public List<StudentDTO> updateStudent(StudentDTO pDTO) throws Exception {
        log.info(this.getClass().getName() + ".updateStudent Start");

        // Student 테이블에 등록된 학생 아이디 존재하는 지 체크하기 위해 DB 조회
        Optional<StudentDTO> res = Optional.ofNullable(studentMapper.getStudent(pDTO));

        // 회원이 존재한다면 수정 진행
        if(res.isPresent()) {
            studentMapper.updateStudent(pDTO); // 수정 쿼리 실행
            log.info(pDTO.getUserId() + "님이 수정되었습니다.");
        } else { // 존재 X
            log.info("회원이 존재하지 않아 수정 작업 실패");
        }

        //학생 전체 조회
        List<StudentDTO> rList = Optional.ofNullable(studentMapper.getStudentList()).orElseGet(ArrayList::new);

        log.info(this.getClass().getName() + ".updateStudent End");
        return rList;
    }

    @Override
    public List<StudentDTO> deleteStudent(StudentDTO pDTO) throws Exception {
        log.info(this.getClass().getName() + ".deleteStudent Start");

        Optional<StudentDTO> res = Optional.ofNullable(studentMapper.getStudent(pDTO));

        if(res.isPresent()) { // 학생이 있으면
            studentMapper.deleteStudent(pDTO);
            log.info("삭제되었습니다.");
        } else { // 존재 X
            log.info("학생이 존재하지 않아 삭제 작업 실패");
        }

        List<StudentDTO> rList = Optional.ofNullable(studentMapper.getStudentList()).orElseGet(ArrayList::new);

        log.info(this.getClass().getName() + ".deleteStudent End");

        return rList;
    }


}
