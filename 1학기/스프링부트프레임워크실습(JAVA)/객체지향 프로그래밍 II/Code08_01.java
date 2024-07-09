class Rabbit2 {
    String shape;
    int x;
    int y;
    static int count; // 생성한 토끼의 수(클래스 변수)

    Rabbit2() {
        count++;
    }
}

public class Code08_01 {
    public static void main(String[] args) {
        System.out.println("객체 생성 전 토끼의 수 ==> " + Rabbit2.count);

        Rabbit2 rabbit = new Rabbit2();
        System.out.println("토끼 객체1 생성 후 토끼의 수 ==> " + Rabbit2.count);

        Rabbit2 rabbit2 = new Rabbit2();
        System.out.println("토끼 객체2 생성 후 토끼의 수 ==> " + Rabbit2.count);
    }
}
