public class Exercise1 {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }
    }
    static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return dividend / divisor;
    }
}
