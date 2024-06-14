import java.util.Scanner;

public class Code05_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 ==>");
        int num = sc.nextInt(); // 사용자가 입력한 정수를 num에 저장

        if (num % 2 == 0) { // num을 2로 나눴을 때 나머지가 0이라면, 즉 짝수인 경우는 참
            System.out.println("짝수입니다."); // 참일 때 실행
        } else { // num을 2로 나눴을 때 나머지가 존재하는 경우, 즉 홀수인 경우는 거짓
            System.out.println("홀수입니다."); // 거짓일 때 실행
        }
        
        sc.close();
    }
}
