public class Exercise3 {
    public static void main(String[] args) {
        String message = "w3resource.com";

        int val1 = message.codePointBefore(1);
        int val2 = message.codePointBefore(9);

        System.out.println("Character(unicode point) = " + val1);
        System.out.println("Character(unicode point) = " + val2);
    }
}
