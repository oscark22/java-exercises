import java.util.HashMap;

public class Exercise9 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> items = new HashMap<>();
        items.put(2, 3);
        items.put(4, 5);

        System.out.println(items.entrySet());
    }
}
