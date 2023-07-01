import java.util.ArrayList;
import java.util.List;

public class Exercise22 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,4,2,3));

        for (int i=0; i<numbers.size() ; i++) {
            System.out.println("index: " + i + " - value: " + numbers.get(i));
        }
    }
}
