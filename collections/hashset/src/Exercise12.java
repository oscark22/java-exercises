import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise12 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(List.of(1,2,3,4,5));
        numbers.clear();

        System.out.println(numbers);
    }
}
