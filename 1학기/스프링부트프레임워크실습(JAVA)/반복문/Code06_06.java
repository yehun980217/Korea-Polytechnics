public class Code06_06 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=10; i++) { // i는 1이고 i가 10과 같거나 작을 때 까지
            sum += i; // sum = sum + i와 같음, i가 증가할 때마다 sum에 합하여 저장
        }

        System.out.println("1부터 10까지의 합계 : " + sum);
    }
}
