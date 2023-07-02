import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 3, 4, 5 };

        double average = Arrays.stream(numbers).average().orElse(0.0);
        System.out.println(average);
    }
}
