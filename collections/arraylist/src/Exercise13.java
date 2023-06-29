import java.util.ArrayList;
import java.util.Arrays;

public class Exercise13 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1,2,3,4));

        ArrayList<Boolean> results = new ArrayList<>();

        for (int i=0; i<numbers.size(); i++) {
            if (numbers.get(i) == numbers2.get(i)) {
                results.add(true);
            } else {
                results.add(false);
            }
        }
        System.out.println(results.toString());
    }
}
