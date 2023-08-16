import java.util.Arrays;
import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {
        // Given a list of integers, find the maximum value element present in it using Stream functions?
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,3,2);
        Integer maximum = numbers.stream()
                .max(Integer::compare)
                .get();
        System.out.println(maximum);
    }
}
