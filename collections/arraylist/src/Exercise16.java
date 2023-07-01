import java.util.ArrayList;
import java.util.List;

public class Exercise16 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> numbersClone = new ArrayList<>(numbers);

        System.out.println(numbersClone);
    }
}
