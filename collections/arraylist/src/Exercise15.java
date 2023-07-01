import java.util.ArrayList;
import java.util.List;

public class Exercise15 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 3, 5));
        ArrayList<Integer> numbers2 = new ArrayList<>(List.of(2, 4, 6));

        numbers.addAll(numbers2);
        System.out.println(numbers);
    }
}
