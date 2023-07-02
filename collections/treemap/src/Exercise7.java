import java.util.Comparator;
import java.util.TreeMap;

public class Exercise7 {
    public static void main(String[] args) {
        TreeMap<String, Integer> colors = new TreeMap<>(new SortingFunction());
        colors.put("Green", 1);
        colors.put("Black", 2);
        colors.put("Orange", 3);

        System.out.println();
    }
}

class SortingFunction implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
