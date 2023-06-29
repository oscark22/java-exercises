import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 4, 5, -1, 5 };
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
    }
}
