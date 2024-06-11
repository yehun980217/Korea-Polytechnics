public class Code04_14 {
    public static void main(String[] args) {
        // indexOf(찾을 문자열) : 어떤 글자가 문자열의 몇 번째 인덱스에 위치하는 지 찾는 메서드
        // 0번부터 시작, 공백도 문자이므로 순서에 포함
        String str = "난생처음 자바";
        System.out.println(str.indexOf("난생"));
        System.out.println(str.indexOf("처"));

        // indexOf(찾을 문자열, 시작 위치) : 똑같은 문자가 여러 개 있을 때 원하는 문자의 위치를 찾는 메서드
        // 찾는 문자열이 시작 위치에서 몇 번재에 있는 지 알려줌

        String str1 = "난생처음 자바를 처음 학습 중입니다. 자바는 처음이지만 재미있네요.";
        System.out.println(str1.indexOf("처음")); // 출력 : 2
        System.out.println(str1.indexOf("처음",4)); // 출력 : 9
    }
}
