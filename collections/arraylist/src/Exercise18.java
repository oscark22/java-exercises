import java.util.ArrayList;
import java.util.List;

public class Exercise18 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,4,6));

        if (numbers.isEmpty()) {
            System.out.println("is empty");
        } else {
            System.out.println("isn't empty");
        }
    }
}
