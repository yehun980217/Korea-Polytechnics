public class Code02_07 {
    public static void main(String[] args) {
        int num1, num2, result; // 정수형 변수 num1, num2, reuslt 선언
        num1 = 100; // num1에 100 기입
        num2 = 50; // num2에 50 기입

        result = num1 + num2; // result에 num1 + num2 값 150 기입
        System.out.println(num1 + " + " + num2 + " = " + result); // 더하기 전체 계산식 출력

        result = num1 - num2; // result에 num1 - num2 값 50 기입
        System.out.println(num1 + " + " + num2 + " = " + result); // 빼기 전체 계산식 출력

        result = num1 * num2; // result에 num1 * num2 값 500 기입
        System.out.println(num1 + " + " + num2 + " = " + result); // 곱하기 전체 계산식 출력

        result = num1 / num2; // result에 num1 / num2 값 2 기입
        System.out.println(num1 + " + " + num2 + " = " + result); // 나누기 전체 계산식 출력
    }
}
