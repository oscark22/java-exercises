import java.util.HashMap;

public class Exercise5 {
    public static void main(String[] args) {
        HashMap<String, String> items = new HashMap<>();
        items.put("a", "b");

        if (items.isEmpty()) {
            System.out.println("is empty");
        } else {
            System.out.println("is not empty");
        }
    }
}
