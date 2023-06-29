import java.util.HashMap;

public class Exercise4 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> items = new HashMap<>();
        items.put(2, 2);
        items.put(3, 3);
        items.put(4, 4);

        items.clear();
        System.out.println(items);
    }
}
