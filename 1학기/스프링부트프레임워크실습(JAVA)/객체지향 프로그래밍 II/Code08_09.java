interface Rabbit3 {
    abstract void sleep();
}

class HouseRabbit implements Rabbit3 {
    public void sleep() {
        System.out.println("집토끼가 집에서 잠을 잡니다.");
    }
}

class MountainRabbit implements Rabbit3 {
    public void sleep() {
        System.out.println("산토끼가 산에서 잠을 잡니다.");
    }
}

public class Code08_09 {
    public static void main(String[] args) {
        HouseRabbit hRabbit = new HouseRabbit();
        MountainRabbit mRabbit = new MountainRabbit();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}
