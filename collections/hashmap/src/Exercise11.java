import java.util.HashMap;

public class Exercise11 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> items = new HashMap<>();
        items.put(2, 2);
        items.put(3, 3);

        System.out.println(items.keySet());
    }
}
