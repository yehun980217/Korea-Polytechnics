public class Code10_04 {
    static int sum_para2(int v1, int v2) {
        return v1 + v2;
    }

    static int sum_para3(int v1, int v2, int v3) {
        return v1 + v2 + v3;
    }


    // 메서드 오버로딩(Overloading) : 매개변수가 다르면 같은 이름의 메서드라도 자바가 알아서 호출된 매개변수에 맞는 메서드를 찾는다.
    static int sum_para(int v1, int v2) { // 메서드 오버로딩, 이름은 같지만 매개변수가 2개
        return v1 + v2;
    }

    static int sum_para(int v1, int v2, int v3) { // 메서드 오버로딩, 이름은 같지만 매개변수가 3개
        return v1 + v2 + v3;
    }

    public static void main(String[] args) {
        int sum;

        sum = sum_para2(10, 20);
        System.out.println("매개변수 2개 메서드 호출 결과 : " + sum);

        sum = sum_para3(10, 20, 30);
        System.out.println("매개변수 3개 메서드 호출 결과 : " + sum);

        // 메서드 오버로딩
        sum = sum_para(10, 20);
        System.out.println("이름이 같은 매개변수 2개 메서드 호출 결과 : " + sum);

        sum = sum_para(10, 20, 30);
        System.out.println("이름이 같은 매개변수 3개 메서드 호출 결과 : " + sum);
    }
}
