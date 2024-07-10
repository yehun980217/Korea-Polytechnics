interface Car {
    void move();
}

interface Cannon {
    void fire();
}

class Tank implements Car, Cannon {
    public void move() {
        System.out.println("탱크가 이동합니다.");
    }

    public void fire() {
        System.out.println("탱크가 포격합니다.");
    }
}

public class Code08_10 {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.move();
        tank.fire();
    }
}
