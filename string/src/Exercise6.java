public class Exercise6 {
    public static void main(String[] args) {
        String msg1 = "This is exercise 1";
        String msg2 = "This is Exercise 1";

        int result = msg1.compareToIgnoreCase(msg2);
        System.out.println("Comparation result = " + result);
    }
}
