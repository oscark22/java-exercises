import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise11 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> numbers2 = new HashSet<>(List.of(1,3,4,8));

        numbers.retainAll(numbers2);
        System.out.println(numbers);
    }
}
