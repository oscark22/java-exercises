import java.util.NavigableSet;
import java.util.TreeMap;

public class Exercise10 {
    public static void main(String[] args) {
        TreeMap<String, Integer> colors = new TreeMap<>();
        colors.put("Green", 1);
        colors.put("Black", 2);
        colors.put("Orange", 3);

        NavigableSet<String> keySet = colors.descendingKeySet();
        System.out.println(keySet);
    }
}
