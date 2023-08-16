import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise3 {
    public static void main(String[] args) {
        // How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,4,2,3,4,2,6,7,2));
        Set<Integer> seen = new HashSet<>();
        numbers.stream()
                .filter(n -> !seen.add(n))
                .forEach(System.out::println);
    }
}
