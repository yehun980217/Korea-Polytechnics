public class Code03_08 {
    public static void main(String[] args) {
        // 복합 대입 연산자 : 변수의 값을 변경한 후 이 값을 자신에게 대입
        int num;
        num = 100; // num에 100 기입
        num = num + 200; // 100이 기입된 num에 + 200을 하여 다시 num에 기입
        System.out.println(num); // 결과 : 300

        int num2 = 20;
        // 증감 연산자
        num2++; System.out.print(num2+" "); // 후위 증가
        num2--; System.out.print(num2+" "); // 후위 감소
        // 대입 연산자
        num2 += 3; System.out.print(num2+" ");
        num2 -= 3; System.out.print(num2+" ");
        num2 *= 3; System.out.print(num2+" ");
        num2 /= 3; System.out.print(num2+" ");
        num2 %= 3; System.out.print(num2+" ");
    }
}
