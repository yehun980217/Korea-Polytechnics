import java.util.Scanner;

public class Code03_10 {
    public static void main(String[] args) {
        // 필기시험의 점수가 70점 이상이면 합격(true) 그렇지 않다면 불합격(false)
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        int score; // 사용자가 입력한 값을 저장할 정수형 변수 선언

        System.out.println("필기시험 점수를 입력하세요 : ");
        score = sc.nextInt(); // score에 입력받은 값을 기입
        System.out.println(score >= 70); // 비교연산자를 이용하여 결과값 true 또는 false를 반환

        sc.close();
    }
}
