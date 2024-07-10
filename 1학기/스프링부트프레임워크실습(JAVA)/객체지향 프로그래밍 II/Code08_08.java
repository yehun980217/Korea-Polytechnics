abstract class Rabbit3 {
    abstract void sleep();
}

class HouseRabbit extends Rabbit3 {
    void sleep() {
        System.out.println("집토끼가 집에서 잠을 잡니다.");
    }
}

class MountainRabbit extends Rabbit3 {
    void sleep() {
        System.out.println("산토끼가 산에서 잠을 잡니다.");
    }
}

public class Code08_08 {
    public static void main(String[] args) {
        HouseRabbit hRabbit = new HouseRabbit();
        MountainRabbit mRabbit = new MountainRabbit();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}
