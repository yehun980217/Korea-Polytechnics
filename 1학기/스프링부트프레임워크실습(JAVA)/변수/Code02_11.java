import java.util.Scanner;

public class Code02_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num;
        System.out.print("실수를 입력하세요 : ");
        num = sc.nextDouble(); // 실수를 입력받는 nextDouble()
        System.out.println("사용자가 입력한 값 : " + num);

        String str;
        System.out.print("문자열을 입력하세요 : ");
        str = sc.next(); // 문자열을 입력받는 next()
        System.out.println("사용자가 입력한 값 : " + str);

        sc.close();
    }
}
