import java.util.List;
import java.util.PriorityQueue;

public class Exercise7 {
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<>(List.of("Purple", "Green", "Red"));
        PriorityQueue<String> colors2 = new PriorityQueue<>(List.of("Orange", "Blue", "Green"));

        for (String color : colors) {
            System.out.println(colors2.contains(color));
        }
    }
}
