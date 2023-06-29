import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise14 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Collections.swap(numbers, 0, 1);
        System.out.println(numbers.toString());
    }
}
