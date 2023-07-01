import java.util.ArrayList;
import java.util.List;

public class Exercise20 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,4,6,7,3));
        numbers.ensureCapacity(10); // increase min capacity to 10
        numbers.add(4);

        System.out.println(numbers);
    }
}
