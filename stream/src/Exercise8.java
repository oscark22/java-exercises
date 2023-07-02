import java.util.Comparator;
import java.util.List;

public class Exercise8 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,4,5,6,7);

        Integer secondLowestNum = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        Integer secondHighestNum = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondLowestNum);
        System.out.println(secondHighestNum);
    }
}
