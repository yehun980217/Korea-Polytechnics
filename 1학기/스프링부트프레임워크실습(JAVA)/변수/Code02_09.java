public class Code02_09 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        int resAdd, resSub, resMul;
        double resDiv;

        resAdd = num1 + num2;
        resSub = num1 - num2;
        resMul = num1 * num2;
        resDiv = (double) num1 / num2; // 변수 앞에 (데이터형) 형식을 붙이면 그 변수의 데이터형이 잠깐 바뀜
       //int resDiv; resDiv = num1 / num2; (num1 / num2) 부분에 경고가 나오는 데 (정수 / 정수)라 실수 0.5가 아닌 항상 0이 나온다는 경고
        /* 정수 (+,-,*,/) 정수 = 정수
        *  정수 (+,-,*,/) 실수 = 실수
        *  실수 (+,-,*,/) 실수 = 실수
        *  정수 : 소수점이 없는 숫자이며 int, long 으로 선언
        *  실수 : 소수점이 반드시 있는 숫자이며 float, double 로 선언
        *  1.0과 1은 데이터타입(double, int)이 완전히 다르므로 전혀 다른 숫자로 취급(연산방법 자체가 다름) */
        System.out.println(num1 + " + " + num2 + " = " + resAdd);
        System.out.println(num1 + " - " + num2 + " = " + resSub);
        System.out.println(num1 + " * " + num2 + " = " + resMul);
        System.out.println(num1 + " / " + num2 + " = " + resDiv);
    }
}
