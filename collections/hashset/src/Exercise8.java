import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(List.of(1,2,3,4,5));
        SortedSet<Integer> numbersTreeSet = new TreeSet<>(numbers);

        System.out.println(numbersTreeSet);
    }
}
