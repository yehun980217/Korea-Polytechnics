public class Code02_06 {
    public static void main(String[] args) {
        int num1, num2, result; // 정수형 변수 num1, num2, result 선언
        
        num1 = 100; // num1에 100 기입
        num2 = 50; // num2에 50 기입
        result = num1 + num2; // result에 num1(100)과 num2(50)을 더한 150 기입
        /* 대입 연산자인 =의 오른쪽을 먼저 계산된 후 왼쪽에 대입되는 구조
        *  num1 + num2 = result 는 오류가 발생 */
        System.out.println(num1 + " + " + num2 + " = " + result); // 전체 계산식 출력
    }
}
