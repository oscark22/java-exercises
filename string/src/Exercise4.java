public class Exercise4 {
    public static void main(String[] args) {
        String message = "w3rsource.com";
        int count = message.codePointCount(0, message.length());
        System.out.println("Codepoint count = " + count);
    }
}
