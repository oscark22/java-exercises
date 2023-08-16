import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        // Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6));
        numbers.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}
