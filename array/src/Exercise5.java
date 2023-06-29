import java.util.Arrays;
import java.util.function.IntPredicate;

public class Exercise5 {
    public static void main(String[] args) {
        int[] numbers = { 3, 4, 5, 6, 2 };
        boolean matched = Arrays.stream(numbers).anyMatch(num -> num == 3);
        System.out.println(matched);
    }
}
