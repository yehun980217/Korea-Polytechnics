public class Code04_16 {
    public static void main(String[] args) {
        // charAt(위치) : 문자열의 각 문자에 접근하는 메서드
        String str = "Java";

        System.out.println(str.charAt(0)); // J
        System.out.println(str.charAt(1)); // a
        System.out.println(str.charAt(2)); // v
        System.out.println(str.charAt(3)); // a
//        System.out.println(str.charAt(4)); 4번째 인덱스는 존재하지 않기에 오류 발생
    }
}
