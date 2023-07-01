import java.util.ArrayList;
import java.util.List;

public class Exercise17 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(2,3,4,7));
        numbers.clear();

        System.out.println(numbers);
    }
}
