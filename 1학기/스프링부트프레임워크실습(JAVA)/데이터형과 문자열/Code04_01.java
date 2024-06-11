public class Code04_01 {
    public static void main(String[] args) {
        byte age = 127; // byte형의 최댓값
        short birth = 32767; // short형의 최댓값
        int money = 2147483647; // int형의 최댓값
        System.out.println((byte)(age+1)); // -128
        System.out.println((short)(birth+1)); // -32768
        System.out.println((int)(money+1)); // -2147483648
    }
}
