public class Code04_17 {
    public static void main(String[] args) {
        // charAt()로 얻는 값은 하나의 문자를 의미하는 char형 문자임
        // 추출한 하나의 문자를 문자열로 취급하고 싶다면 substring()을 사용해야함
        String str = "Java";
        System.out.println(str.substring(0, 1)); // 출력 : J, 인덱스 0 부터 1 전까지 출력
        System.out.println(str.substring(2, 4)); // 춯력 : va, 인덱스 2(v)부터 4 전까지 출력
    }
}
