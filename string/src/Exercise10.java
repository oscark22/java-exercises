public class Exercise10 {
    public static void main(String[] args) {
        String msg1 = "example.com", msg2 = "Example.com";
        StringBuffer buffer1 = new StringBuffer(msg1);

        System.out.println(msg1.contentEquals(buffer1));
        System.out.println(msg2.contentEquals(buffer1));
    }
}
