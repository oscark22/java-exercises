import java.util.List;
import java.util.PriorityQueue;

public class Exercise6 {
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<>(List.of("Purple", "Green", "Red"));
        System.out.println(colors.size());
    }
}
