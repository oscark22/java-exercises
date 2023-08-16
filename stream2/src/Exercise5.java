import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        // Given a list of integers, find the total number of elements present in the list using Stream functions?
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        long count = numbers.stream().count();
        System.out.println(count);
    }
}
