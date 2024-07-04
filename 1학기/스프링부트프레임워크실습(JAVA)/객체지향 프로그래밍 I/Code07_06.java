class Rabbit {
    String shape;
    int x,y;

    Rabbit() { // 토끼 객체 생성 시 모양을 '토끼'로 초기화하는 생성자
        shape = "토끼";
    }

    Rabbit(String shape) { // 매개변수가 있는 생성자
        this.shape = shape;
    }

    void setPosition(int x, int y) {
        this.x = x; // this는 현재 클래스를 의미하는 예약어
        this.y = y;
    }
}

public class Code07_06 {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit(); // 생성자로 인해 생성 시 shape는 '토끼'가 됨
        Rabbit rabbit2 = new Rabbit();
        Rabbit rabbit3 = new Rabbit();
        Rabbit rabbit4 = new Rabbit("왕토끼"); // 매개변수를 넣어 객체 생성 시 shape는 '왕토끼'가 됨

        rabbit2.shape = "원";
        rabbit3.shape = "삼각형";

        rabbit1.setPosition(100, 100); // Rabbit 클래스에 생성한 setPosition() 메서드 호출
        rabbit2.setPosition(-100, 100);
        rabbit3.setPosition(0, -100);

        System.out.println(rabbit1.shape); // 토끼
        System.out.println(rabbit2.shape); // 원
        System.out.println(rabbit3.shape); // 삼각형
        System.out.println(rabbit4.shape); // 왕토끼

    }
}
