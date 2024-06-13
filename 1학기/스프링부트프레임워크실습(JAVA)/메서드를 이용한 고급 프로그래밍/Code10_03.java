public class Code10_03 {
    static int plus(int v1, int v2) { // 입력받은 두 정수의 합계를 반환하는 메서드
        return v1 + v2; // 합계 반환
    }

    public static void main(String[] args) {
        int sum;
        sum = plus(100, 200); // plus()에 정수 100과 200을 보내서 더한 값을 반환받아 sum에 기입시킴
        System.out.println("100과 200의 plus() 메서드 결과 : " + sum);
    }
}
