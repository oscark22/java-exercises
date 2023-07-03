import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise5 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(List.of(1,2,3,4,5));

        if (numbers.isEmpty()) {
            System.out.println("is empty");
        } else {
            System.out.println("isn't empty");
        }
    }
}
