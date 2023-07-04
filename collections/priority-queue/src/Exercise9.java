import java.util.List;
import java.util.PriorityQueue;

public class Exercise9 {
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<>(List.of("Green"));
        System.out.println(colors.poll());
    }
}
