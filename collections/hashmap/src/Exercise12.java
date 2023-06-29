import java.util.HashMap;

public class Exercise12 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> items = new HashMap<>();
        items.put(2, 2);
        items.put(4, 3);
        items.put(8, 9);

        System.out.println(items.values());
    }
}
