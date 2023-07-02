import java.util.SortedMap;
import java.util.TreeMap;

public class Exercise25 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colors = new TreeMap<>();
        colors.put(1, "Green");
        colors.put(2, "Pink");
        colors.put(3, "Yellow");

        SortedMap<Integer, String> submap = colors.headMap(2);
        System.out.println(submap);
    }
}
