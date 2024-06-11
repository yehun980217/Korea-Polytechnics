package variables;

public class Code04_13 {
    public static void main(String[] args) {
        String str = "    한글    ABCD   efgh    ";
        String  cutStr = "";

        cutStr = str.trim();

        System.out.println("기존 문자열 -> [" + str + "]"); // 출력 : 기존 문자열 -> [    한글    ABCD   efgh    ]
        System.out.println("공백 제거 -> [" + cutStr + "]"); // 출력 : 공백 제거 -> [한글    ABCD   efgh]

        //trim()은 문자열 중간의 공백은 자르지 않음
        // 문자열 전체의 공백을 제거하려면 replaceAll() 메서드를 사용해야함

        cutStr = str.replaceAll(" ", "");
        System.out.println("기존 문자열 -> [" + str + "]"); // 출력 : 기존 문자열 -> [    한글    ABCD   efgh    ]
        System.out.println("전체 공백 제거 -> [" + cutStr + "]"); // 출력 : 전체 공백 제거 -> [한글ABCDefgh]

        /* replaceAll()은 공백 제거만이 아닌 특정 문자열을 다른 문자열로 대체하는 메서드이다.
        * replaceAll("난생", "First")로 한다면 "난생"이라는 글자를 모두 "First"로 변경한다.*/
    }
}
