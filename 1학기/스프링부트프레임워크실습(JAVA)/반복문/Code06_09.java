public class Code06_09 {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) { // 2. 해당 반복문의 i가 후위증감으로 +1됨
            for (int k=0; k<3; k++) { // 1. 이 반복문의 진행이 다 끝나서 벗어나면
                System.out.println("i : " + i + ", k : " + k);
            }
        }
    }
}
