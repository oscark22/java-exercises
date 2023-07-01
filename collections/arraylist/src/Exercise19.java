import java.util.ArrayList;
import java.util.List;

public class Exercise19 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,5,6));
        numbers.trimToSize();

        System.out.println(numbers);
    }
}
