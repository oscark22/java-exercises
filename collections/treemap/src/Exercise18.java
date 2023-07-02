import java.util.NavigableSet;
import java.util.TreeMap;

public class Exercise18 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colors = new TreeMap<>();
        colors.put(1, "Green");
        colors.put(2, "Pink");
        colors.put(3, "Yellow");

        NavigableSet<Integer> keys = colors.navigableKeySet();
        System.out.println(keys);
    }
}
