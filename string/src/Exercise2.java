public class Exercise2 {
    public static void main(String[] args) {
        String message = "w3resource.com";
        int val1 = message.codePointAt(1);
        int val2 = message.codePointAt(9);

        System.out.println("Character(unicode point) = " + val1);
        System.out.println("Character(unicode point) = " + val2);
    }
}
