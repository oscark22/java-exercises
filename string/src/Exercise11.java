public class Exercise11 {
    public static void main(String[] args) {
        char[] chars = new char[] { 'a', 'b', 'c' };
        String str = String.copyValueOf(chars);
        System.out.println(str);
    }
}
