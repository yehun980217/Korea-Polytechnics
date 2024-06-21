public class Code06_01 {
    public static void main(String[] args) {
        System.out.println("난생처음 자바는 재미있습니다.^^");
        System.out.println("난생처음 자바는 재미있습니다.^^");
        System.out.println("난생처음 자바는 재미있습니다.^^");
        // 위의 코드가 100줄이 넘게 필요하다면 코드도 길어지고 가독성도 떨어지고 하나하나 작성해야한다..
        //반복문을 사용하면 코드도 간결해지고 가독성도 높아진다. 20줄, 50줄, 100줄을 반복해야 할 때 더욱 유용해진다.
        for (int i = 0; i < 3; i++) {
            System.out.println("난생처음 자바는 재미있습니다.^^");
        }
    }
}
