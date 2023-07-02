import java.util.TreeMap;

public class Exercise9 {
    public static void main(String[] args) {
        TreeMap<String, Integer> colors = new TreeMap<>();
        colors.put("Green", 1);
        colors.put("Black", 2);
        colors.put("Orange", 3);

        String lowest = colors.firstKey();
        String highest = colors.lastKey();

        System.out.println(lowest);
        System.out.println(highest);
    }
}
