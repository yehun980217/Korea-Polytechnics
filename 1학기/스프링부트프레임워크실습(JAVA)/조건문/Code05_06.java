import java.util.Scanner;

public class Code05_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 ==> ");
        int num = sc.nextInt();
        
        if (num > 100) {
            if (num < 1000) {
                System.out.println("100보다 크고 1000보다 작습니다.");
            } else {
                System.out.println("1000보다 크거나 같습니다.");
            }
        } else {
            System.out.println("100보다 작거나 같습니다.");
        }
    }
}
