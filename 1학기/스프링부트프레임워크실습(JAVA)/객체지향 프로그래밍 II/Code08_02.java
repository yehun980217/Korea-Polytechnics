import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Rabbit3 {
    String shape;
    int x;
    int y;

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Rabbit3() {
        System.out.println("1. 슈퍼 클래스의 생성자가 호출됩니다.");
    }
}

class HouseRabbit extends Rabbit3 {
    String owner;
    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }

    HouseRabbit() {
        System.out.println("2. 서브 클래스의 생성자가 호출됩니다.");
    }
}

class MountainRabbit extends Rabbit3 {
    String mountain;
    void eatWildglass() {
        System.out.println("산토끼가 풀을 먹습니다.");
    }

    MountainRabbit() {
        System.out.println("2. 서브 클래스의 생성자가 호출됩니다.");
    }
}

public class Code08_02 {
    public static void main(String[] args) {
        HouseRabbit hRabbit = new HouseRabbit();
        MountainRabbit mRabbit = new MountainRabbit();

        hRabbit.eatFeed();
        mRabbit.eatWildglass();
    }

}
