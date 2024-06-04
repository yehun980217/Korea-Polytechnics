public class Code03_05 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;

        // 연산자의 우선순위가 다른 경우
        System.out.println(a * b + c); // 앞에 있는 a * b를 먼저 하고 후에 + c
        System.out.println(c + a * b); // 뒤에 있는 a * b를 먼저 하고 후에 + c
    }
}
