import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise7 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(List.of(1,2,3,4,5));
        Integer[] numArray = new Integer[numbers.size()];

        numbers.toArray(numArray);
        System.out.println(numbers);
    }
}
