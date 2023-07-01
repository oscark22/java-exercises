import java.util.ArrayList;
import java.util.List;

public class Exercise21 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(2,4,6,7));
        numbers.set(1, 0);

        System.out.println(numbers);
    }
}
