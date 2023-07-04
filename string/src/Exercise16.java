public class Exercise16 {
    public static void main(String[] args) {
        String message = "This is a sample String.";
        byte[] byteArr = message.getBytes();
        String newMessage = new String(byteArr);

        System.out.println(byteArr);
        System.out.println(newMessage);
    }
}
