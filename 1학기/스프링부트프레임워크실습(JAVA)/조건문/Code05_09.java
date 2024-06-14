import java.util.Scanner;

public class Code05_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;

        System.out.print("1~3 중에 선택하세요 : ");
        select = sc.nextInt();

        switch (select) { // 입력한 select의 값에 따라 분기
            case 1: // select의 값이 1인 경우 실행
                System.out.println("1을 선택하였습니다.");
                break;
            case 2: // select의 값이 2인 경우 실행
                System.out.println("2를 선택하였습니다.");
                break;
            case 3: // select의 값이 3인 경우 실행
                System.out.println("3을 선택하였습니다.");
                break;
            default: // 1~3이 아닌 경우에 실행
                System.out.println("잘못된 값을 선택하였습니다.");
        }

        // 각 실행문 마지막에는 반드시 break문을 작성해야한다. 작성하지않을 경우에는 select의 값이 2라도 case2를 실행한 후 빠져나오지못하고 case3, default의 코드들이 수행된다.

        sc.close();
    }
}
