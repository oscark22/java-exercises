import java.util.Arrays;
import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 4, 6, 2, 3 };
        int index = Arrays.binarySearch(numbers, 1);

//        using stream API
//        boolean found = Arrays.stream(numbers).anyMatch(x -> x == 1);

        System.out.println(index == -1 ? "not found" : "found");
    }
}
