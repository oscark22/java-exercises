import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        // Given the list of integers, find the first element of the list using Stream functions?
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        numbers.stream().findFirst().ifPresent(System.out::println);
    }
}
