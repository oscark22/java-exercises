import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = { 3, 4, 5, -1, 5 };
        double average = Arrays.stream(numbers).average().orElse(0);
        System.out.println(average);
    }
}
