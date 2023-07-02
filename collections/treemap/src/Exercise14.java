import java.util.NavigableMap;
import java.util.TreeMap;

public class Exercise14 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colors = new TreeMap<>();
        colors.put(1, "Green");
        colors.put(2, "Pink");
        colors.put(3, "Yellow");

        NavigableMap<Integer, String> headMap = colors.headMap(2, true);
        System.out.println(headMap);
    }
}
