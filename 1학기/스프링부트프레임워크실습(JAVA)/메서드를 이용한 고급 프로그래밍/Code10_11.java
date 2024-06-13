public class Code10_11 {
    static int a = 100; // 전역 변수

    static void method1() {
        int a = 200; // 지역변수, 중괄호를 벗어나면 값 상실
        System.out.println("method1()에서 a의 값 : " + a);
    }

    static void method2() {
        a = a + 1; // method1()의 int a는 지역 변수기에 method2()에서는 사용 불가
        System.out.println("method2()에서 a의 값 : " + a);
    }

    public static void main(String[] args) {
        method1();
        method2();
    }
}
