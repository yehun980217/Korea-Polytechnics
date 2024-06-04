public class Code02_08 {
    public static void main(String[] args) {
        String str1 = "난생처음"; // 문자열 변수 str1에 "난생처음" 기입
        String str2 = "자바"; // 문자열 변수 str2에 "자바" 기입

        System.out.print(str1); // ln이 없기에 출력 후 줄바꿈없이 "난생처음" 출력
        System.out.println(str2); // ln이 있기에 출력 후 줄바꿈을 하며 "자바" 출력

        String result = str1 + str2; // "난생처음" + "자바" = "난생처음자바"
        System.out.println(result);
    }
}
