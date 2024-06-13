public class Code10_08 {
    static void method1() { // void 반환값 X
        System.out.println("반환값이 없는 메서드 실행");
    }

    static int method2() { // 정수를 반환하는 메서드, 반환값이 하나
        int result;
        result = 100;
        return result;
    }

    // 원칙적으로 메서드는 반환값을 한 개만 돌려줄 수 있음
    // 만약 반환값이 두 개라면 배열로 만들어서 돌려줄 수 있음 (배열은 여러 값으로 이루어지지만 그 자체는 하나이기 때문)
    static int[] method3(int v1, int v2) {
        int res1, res2;
        res1 = v1 + v2;
        res2 = v1 - v2;
        return new int[] {res1, res2};
    }

    public static void main(String[] args) {
        method1();

        int res = method2();
        System.out.println("method2()에서 돌려준 값 : " + res);

        int num1 = 100, num2 = 200;
        int[] resAry;
        resAry = method3(num1, num2);
        System.out.println("100 + 200의 결과 : " + resAry[0]);
        System.out.println("100 - 200의 결과 : " + resAry[1]);
    }
}
