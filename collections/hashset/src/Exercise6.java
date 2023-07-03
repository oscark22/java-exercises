import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise6 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> numbersClone = new HashSet<>(numbers);

        System.out.println(numbersClone);
    }
}
