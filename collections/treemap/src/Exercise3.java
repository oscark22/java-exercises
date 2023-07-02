import java.util.TreeMap;

public class Exercise3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> colors = new TreeMap<>();
        colors.put("Green", 1);
        colors.put("Black", 2);
        colors.put("Orange", 3);

        boolean keyFound = colors.containsKey("Green");
        System.out.println(colors);
        System.out.println(keyFound ? "Has key" : "Does not have key");
    }
}
