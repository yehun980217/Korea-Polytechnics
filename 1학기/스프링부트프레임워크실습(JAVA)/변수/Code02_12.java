public class Code02_12 {
    public static void main(String[] args) {
        int num1;
        double num2;
        String str;

        str = "1234"; // 문자열 "1234", 정수 X
        num1 = Integer.parseInt(str); // 문자열 "1234"를 정수형 1234로 변환
        System.out.println("문자열 -> 정수 : " + num1);

        str = "3.14";
        num2 = Double.parseDouble(str); // 문자열 "3.14"를 실수형 3.14로 변환
        System.out.println("문자열 -> 실수 : " + num2);
    }
}
