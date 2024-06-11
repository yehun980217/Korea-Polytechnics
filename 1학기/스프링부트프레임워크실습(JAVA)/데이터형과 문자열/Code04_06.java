public class Code04_06 {
    public static void main(String[] args) {
//      System.out.printf("%d / %d = %d", 100, 200, 0.5); 실수에 정수를 표현하는 %d를 사용하여 오류 발생
        System.out.printf("%d / %d = %f \n", 100, 200, 0.5); // 실수의 서식 %f로 변경, 출력 : 0.500000
        System.out.printf("%d / %d = %3.1f \n", 100, 200, 0.5); // 0.5만 출력되도록 변경, 출력 : 0.5

        // 정수의 자릿수를 넓히고 싶은 경우
        System.out.printf("%d \n", 123); // 출력 : 123
        System.out.printf("%5d \n", 123); // 출력 :   123
        System.out.printf("%05d \n", 123); // 출력 : 00123

        // 문자열 서식
        System.out.printf("난생처음 자바 \n");
        System.out.printf("%s\n", "난생처음 자바");
        // 문자열 출력 자릿수 지정
        System.out.printf("%20s \n", "난생처음 자바"); // 출력 :              난생처음 자바
    }
}
