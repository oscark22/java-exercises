import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise2 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(List.of(1,2,3,4,5));

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
