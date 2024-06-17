package kopo.poly;

import kopo.poly.dto.StudentDTO;
import kopo.poly.service.IStudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class SpringDataBasicApplication implements CommandLineRunner {

	private final IStudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataBasicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("자바 프로그래밍 시작!!");
		StudentDTO pDTO; // 학생 등록, 수정, 삭제에 활용될 DTO
		List<StudentDTO> rList; // DB 조회 결과를 표현

		// 학생 등록
		pDTO = new StudentDTO();

		pDTO.setUserId("shin");
		pDTO.setUserName("신예훈");
		pDTO.setEmail("shin@gmail.com");
		pDTO.setAddr("수원");

		rList = studentService.insertStudent(pDTO);

		rList.forEach(dto -> {
			log.info("DB에 저장된 아이디 : " + dto.getUserId());
			log.info("DB에 저장된 이름 : " + dto.getUserName());
			log.info("DB에 저장된 이메일 : " + dto.getEmail());
			log.info("DB에 저장된 주소 : " + dto.getAddr());
		});

		//학생 수정
		pDTO = new StudentDTO();

		pDTO.setUserId("shin");
		pDTO.setUserName("신예훈_수정");
		pDTO.setEmail("shin@gmail.com");
		pDTO.setAddr("수원_수정");

		rList = studentService.updateStudent(pDTO);

		rList.forEach(dto -> {
			log.info("DB에 저장된 아이디 : " + dto.getUserId());
			log.info("DB에 저장된 이름 : " + dto.getUserName());
			log.info("DB에 저장된 이메일 : " + dto.getEmail());
			log.info("DB에 저장된 주소 : " + dto.getAddr());
		});

		// 학생 삭제
		pDTO = new StudentDTO();

		pDTO.setUserId("shin");

		rList = studentService.deleteStudent(pDTO);

		log.info("자바 프로그래밍 종료");
	}

}
