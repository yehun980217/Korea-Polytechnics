package kopo.poly.mapper;

import kopo.poly.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStudentMapper {

    void insertStudent(StudentDTO pDTO) throws Exception; // 학생 등록

    List<StudentDTO> getStudentList() throws Exception; // 전체 학생 목록 조회

    StudentDTO getStudent(StudentDTO pDto) throws Exception; // 학생 조회

    void updateStudent(StudentDTO pDTO) throws Exception; // 학생 수정
    
    void deleteStudent(StudentDTO pDTO) throws Exception; // 학생 삭제
}
