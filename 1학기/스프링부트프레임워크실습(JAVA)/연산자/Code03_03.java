public class Code03_03 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;

        /* 하나의 연산에 여러 개의 연산자가 있는 경우에 연산자 우선순위가 정해져야 정확한 계산이 가능
        * 연산자의 우선순위가 동일한 경우
        * 계산방향
        * ────────────────>*/
        System.out.println(a + b - c);
        System.out.println(a - c + b);
        System.out.println(-c + a + b);
        System.out.println(a * b / c);
    }
}
