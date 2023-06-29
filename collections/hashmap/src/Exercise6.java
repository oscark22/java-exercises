import java.util.HashMap;

public class Exercise6 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> items = new HashMap<>();
        items.put(2, 2);

        HashMap<Integer, Integer> copy = (HashMap) items.clone();
        items.put(2, 4);

        System.out.println(items);
        System.out.println(copy);
    }
}
