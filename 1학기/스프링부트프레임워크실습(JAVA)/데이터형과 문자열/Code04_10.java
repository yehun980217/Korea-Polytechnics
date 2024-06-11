import java.util.Scanner;

public class Code04_10 {
    public static void main(String[] args) {
        String str = "난생처음 자바";
        int len; // 문자열 길이를 저장하기 위해 정수형 변수 선언

        len = str.length(); // 문자열의 길이를 변수 len에 저장

        System.out.println("문자열 : " + str);
        System.out.println("문자열 길이 : " + len);

        // 두 문자열을 입력받고 어떤 문자열이 더 긴지 비교하는 예제
        Scanner sc = new Scanner(System.in);

        String str1, str2;
        int diff;

        System.out.print("첫번째 문자열 -> ");
        str1 = sc.nextLine();
        System.out.print("두번째 문자열 -> ");
        str2 = sc.nextLine();

        diff = str1.length() - str2.length();
        System.out.println("두 문자열 길이의 차이는 " + diff + "입니다.");
        sc.close();
    }
}
