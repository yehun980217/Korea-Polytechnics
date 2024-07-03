import java.util.Scanner;

public class Code06_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum = 0;

        while (true) { // 항상 참이라 무한 반복됨
            System.out.println("숫자 1 ==> " );
            num1 = sc.nextInt();
            if (num1 == 0) { // 입력받은 숫자가 0이라면
                break; // 반복문 탈출
            }

            System.out.println("숫자 2 ==> ");
            num2 = sc.nextInt();

            sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        }

        System.out.println("0을 입력하여 계산을 종료합니다.");
        sc.close();
    }
}
