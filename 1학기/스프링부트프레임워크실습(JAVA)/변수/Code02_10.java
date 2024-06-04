import java.util.Scanner;

public class Code02_10 {
    public static void main(String[] args) {
        // Scanner : 변수의 값을 키보드로 입력받도록 도와주는 역할
        // 기본적인 객체 생성 방법 : 클래스_이름 객체_이름 = new 클래스_이름();
        Scanner sc = new Scanner(System.in); // 스캐너 클래스를 호출

        int num;

        num = sc.nextInt(); // 정수를 입력받아 num에 기입, 정수 외에 다른 값은 오류 처리
        System.out.println("사용자가 입력한 값 : " + num);

        sc.close(); // 호출 종료
    }
}
