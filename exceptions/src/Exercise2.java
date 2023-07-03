public class Exercise2 {
    public static void main(String[] args) {
        try {
            boolean isEven = isEven(3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e);
        }
    }

    static boolean isEven(int number) {
        if (number % 2 == 1) {
            throw new IllegalArgumentException("The number is even.");
        }
        return true;
    }
}
