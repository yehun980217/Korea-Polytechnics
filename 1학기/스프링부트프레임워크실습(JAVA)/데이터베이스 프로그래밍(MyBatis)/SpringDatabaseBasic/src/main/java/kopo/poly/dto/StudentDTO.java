package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO {
    private String userId; // 회원 아이디
    private String userName; // 회원 이름
    private String email; // 회원 이메일
    private String addr; // 회원 주소
}
