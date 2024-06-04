public class Code03_12 {
    public static void main(String[] args) {
        int num = 99;

        System.out.println((num > 100) && (num < 200)); // && : and 연산자로 모두 참이여야 참을 반환
        System.out.println((num == 99) || (num == 100)); // || : or(파이프) 연산자로 하나만 참이여도 참을 반환
        System.out.println(!(num == 100)); // ! : not 연산자로 조건이 거짓이면 참을 반환
    }
}
