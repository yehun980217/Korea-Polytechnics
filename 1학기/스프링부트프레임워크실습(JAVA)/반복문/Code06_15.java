public class Code06_15 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=100; i++) {
            if (i%4 == 0) { // i를 4로 나눴을 때 나머지가 0 == 4의 배수
                continue; // 아래 코드들은 시행하지않고 다시 for문 조건식으로 돌아감
            }
            sum += i;
        }

        System.out.println("4의 배수를 제외한 1부터 100까지의 합계 : " + sum);
    }
}
