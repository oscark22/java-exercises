import java.util.HashMap;

public class Exercise8 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> items = new HashMap<>();
        items.put(2, 2);

        System.out.println(items.containsValue(2));
    }
}
