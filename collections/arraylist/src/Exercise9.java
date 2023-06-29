import java.util.ArrayList;

public class Exercise9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);

        ArrayList<Integer> numbersCopy = new ArrayList<>(numbers);

        numbers.set(1, 1);
        System.out.println(numbers);
        System.out.println(numbersCopy);
    }
}
