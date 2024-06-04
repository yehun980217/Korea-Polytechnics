public class Code03_07 {
    public static void main(String[] args) {
        // =을 기준으로 오른쪽의 값이나 계산 결과를 왼쪽의 변수에 대입
        // =의 왼쪽에는 변수가 한 개여야 함
        int num;
        num = 100; // num에 100을 기입
        num = 100 * 200; // num에 100 * 200의 계산 결과를 기입
        num = Integer.parseInt("100") + Integer.parseInt("200"); // num에 parseInt를 이용해 문자열에서 정수로 변환한 값의 계산 결과를 기입
    }
}
