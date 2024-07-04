public class Code07_02 {
    public static void main(String[] args) {
        Turtle turtle1 = new Turtle(); // 거북이 클래스를 이용하여 거북이 객체 생성
        Turtle turtle2 = new Turtle(); // 클래스가 있다면 객체를 여러 개 생성 가능
        Turtle turtle3 = new Turtle();

        // 세 거북이 객체를 각각 다르게 설정할 수도 있음
        turtle1.shape("circle");
        turtle1.setPosition(100, 100);
        turtle2.shape("turtle");
        turtle2.setPosition(0, -100);
        turtle3.shape("triangle");
        turtle3.setPosition(-100, 100);
    }
}
