import java.util.ArrayList;
import java.util.Collections;

public class Exercise11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        for (int i=0; i<numbers.size()/2; i++) {
            int tmp = numbers.get(i);
            numbers.set(i, numbers.get(numbers.size()-1-i));
            numbers.set(numbers.size()-1-i, tmp);
        }
        System.out.println(numbers);

        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
