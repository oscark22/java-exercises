import java.util.HashMap;

public class Exercise7 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> items = new HashMap<>();
        items.put(2, 2);

        System.out.println(items.containsKey(2));
    }
}
