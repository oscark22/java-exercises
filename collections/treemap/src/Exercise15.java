import java.util.TreeMap;

public class Exercise15 {
    public static void main(String[] args) {
        TreeMap<Integer, String> colors = new TreeMap<>();
        colors.put(1, "Green");
        colors.put(2, "Pink");
        colors.put(3, "Yellow");

        int key = colors.higherKey(2);
        System.out.println(key);
    }
}
