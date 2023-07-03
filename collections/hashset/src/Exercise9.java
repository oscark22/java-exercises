import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise9 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(List.of(1,2,3,4,5));

        Integer lessThanSeven = numbers.stream()
                .filter(num -> num < 7)
                .findFirst()
                .orElse(null);

        System.out.println(lessThanSeven);
    }
}
