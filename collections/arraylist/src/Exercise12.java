import java.util.ArrayList;
import java.util.List;

public class Exercise12 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(-4);
        numbers.add(-1);

        List<Integer> slice = numbers.subList(0, 2); // last not inclusive
        System.out.println(slice);
    }
}
