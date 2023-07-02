import java.util.TreeMap;

public class Exercise12 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colors = new TreeMap<>();
        colors.put(1, "Green");
        colors.put(2, "Pink");
        colors.put(3, "Yellow");

        Integer colorKey = colors.floorKey(2);
        System.out.println(colorKey);
    }
}
