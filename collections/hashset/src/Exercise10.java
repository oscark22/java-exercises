import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise10 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> numbers2 = new HashSet<>(List.of(1,3,4,8));

        for (Integer number : numbers) {
            System.out.println(numbers2.contains(number));
        }
    }
}
