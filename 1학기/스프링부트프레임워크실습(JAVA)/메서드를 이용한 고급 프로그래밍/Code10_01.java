public class Code10_01 {
    public static void main(String[] args) {
/*        int diceNum;

        System.out.println("A님, 주사위를 던집니다.");
        diceNum = (int) (Math.random() * 6);
        System.out.println("결과 : " + diceNum);

        System.out.println("B님, 주사위를 던집니다.");
        diceNum = (int) (Math.random() * 6);
        System.out.println("결과 : " + diceNum);

        System.out.println("C님, 주사위를 던집니다.");
        diceNum = (int) (Math.random() * 6);
        System.out.println("결과 : " + diceNum);*/

        // 이렇게 코드를 작성하면 Math.random()은 0 ~ 5까지의 값을 반환한다.
        // 그렇기에 Math.random() * 6 + 1을 해줘야 주사위 범위인 1 ~ 6까지의 값을 반환하는 데
        // 6, 10, 14행을 일일히 수정해야하지만 이 반복되는 과정을 메서드로 만들면 일일히 수정해야하는 불편함이 줄어든다.

        System.out.println("A님, 주사위를 던집니다.");
        drawDice();

        System.out.println("B님, 주사위를 던집니다.");
        drawDice();

        System.out.println("C님, 주사위를 던집니다.");
        drawDice();
    }

    static void drawDice() { // 메서드 정의
        int diceNum;
        diceNum = (int) (Math.random() * 6 + 1);
        System.out.println("결과 : " + diceNum);

        // 메서드를 사용함으로써 코드의 길이가 짧아지고, 코드 수정 및 유지 보수가 수월해진다.
    }
}