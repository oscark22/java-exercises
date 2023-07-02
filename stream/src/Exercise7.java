import java.util.Arrays;
import java.util.List;

public class Exercise7 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 5, 6, 7);

        Integer min = numbers.stream().min(Integer::compareTo).orElse(null);
        Integer max = numbers.stream().max(Integer::compareTo).orElse(null);

        System.out.println("min: " + min + "\nmax: " + max);
    }
}
