import java.util.List;
import java.util.PriorityQueue;

public class Exercise3 {
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<>(List.of("Purple", "Green", "Red"));
        PriorityQueue<String> colors2 = new PriorityQueue<>(List.of("Orange", "Blue"));

        colors.addAll(colors2);
        System.out.println(colors);
    }
}
