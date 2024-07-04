class Tiger {
    private String shape;
    public int x;
    public int y;

    void setShape(String shape) {
        this.shape = shape;
    }

    void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Code07_12 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();

        // tiger.shape = "호랑이"; private가 붙은 속성은 메서드를 통해서만 접근이 가능하기에 오류 발생
        tiger.setShape("호랑이");

        tiger.setPosition(100, 100);
        System.out.println(tiger.x);
        tiger.x = 200; // public은 외부에서 클래스 내부의 속성이나 메서드에 접근 가능
        System.out.println(tiger.x);
    }
}
