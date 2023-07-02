import java.util.Map;
import java.util.TreeMap;

public class Exercise8 {
    public static void main(String[] args) {
        TreeMap<String, Integer> colors = new TreeMap<>();
        colors.put("Green", 1);
        colors.put("Black", 2);
        colors.put("Orange", 3);

        Map.Entry<String, Integer> entry = colors.firstEntry();
        Map.Entry<String, Integer> entry2 = colors.lastEntry();

        System.out.println("first entry -> " + entry);
        System.out.println("last entry -> " + entry2);
    }
}
