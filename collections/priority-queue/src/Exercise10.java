import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Exercise10 {
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<>(List.of("Green", "Blue"));
        System.out.println(Arrays.toString(colors.toArray()));
    }
}
