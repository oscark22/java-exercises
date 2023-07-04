import java.util.List;
import java.util.PriorityQueue;

public class Exercise5 {
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<>(List.of("Purple", "Green", "Red"));
        colors.clear();
        System.out.println(colors);
    }
}
