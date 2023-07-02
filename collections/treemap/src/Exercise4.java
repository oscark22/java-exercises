import java.util.TreeMap;

public class Exercise4 {
    public static void main(String[] args) {
        TreeMap<String, Integer> colors = new TreeMap<>();
        colors.put("Green", 1);
        colors.put("Black", 2);
        colors.put("Orange", 3);

        boolean hasValue = colors.containsValue(1);
        System.out.println(hasValue ? "has value" : "does not have value");
    }
}
