import java.util.Scanner;

public class Code09_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numAry = new int[4]; // 인덱스 0~3까지 있는 4칸 배열 생성
        int sum = 0;

        for (int i=0; i<=3; i++) { // 인덱스가 0부터 시작하기에 i=0 부터 i가 3보다 작거나 같을때까지 반복
            System.out.print("숫자 : ");
            numAry[i] = sc.nextInt(); // i는 0,1,2,3순으로 증가 즉 인덱스 0부터 사용자가 입력한 값이 저장
            sum += numAry[i];
        }

        System.out.println("합계 -> " + sum);
        sc.close();
    }
}
