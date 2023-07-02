import java.util.Map;
import java.util.TreeMap;

public class Exercise20 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colors = new TreeMap<>();
        colors.put(1, "Green");
        colors.put(2, "Pink");
        colors.put(3, "Yellow");

        Map.Entry<Integer, String> entry = colors.pollLastEntry();
        System.out.println(entry);
        System.out.println(colors);
    }
}
