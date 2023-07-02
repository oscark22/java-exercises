import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1,2,3,4,5,6 };

        int evenSum = Arrays.stream(numbers).filter(num -> num % 2 == 0).sum();
        System.out.println("Even sum: " + evenSum);

        int oddSum = Arrays.stream(numbers).filter(num -> num % 2 == 1).sum();
        System.out.println("Odd sum: " + oddSum);
    }
}
