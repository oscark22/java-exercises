import java.util.TreeMap;

public class Exercise2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "Purple");

        TreeMap<Integer, String> treeMap2 = new TreeMap<>(treeMap);
        System.out.println(treeMap2);
    }
}
