import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {
        String[] names = new String[] { "Daniel", "Danny", "Abraham", "Axel", "Bryan" };

        List<String> sortedNames = Arrays.stream(names)
                .sorted()
                .toList();

        List<String> reversedSortedNames = Arrays.stream(names)
                .sorted(Comparator.reverseOrder()) // (o1, o2) -> o2.compareTo(o1)
                .toList();

        System.out.println(sortedNames);
        System.out.println(reversedSortedNames);
    }
}
