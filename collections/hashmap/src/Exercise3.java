import java.util.HashMap;

public class Exercise3 {
    public static void main(String[] args) {
        HashMap<String, String> items = new HashMap<>();
        items.put("item1", "val1");
        items.put("item2", "val2");

        HashMap<String, String> items2 = new HashMap<>();
        items2.putAll(items);

        System.out.println(items2);
    }
}
