public class Code06_08 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1001; i<=2000; i+=2) { // 홀수의 합을 구하기 위해 i가 1001부터 2씩 증가
            sum += i;
        }

        System.out.println("1000부터 2000까지 홀수의 합계 : " + sum);
    }
}
