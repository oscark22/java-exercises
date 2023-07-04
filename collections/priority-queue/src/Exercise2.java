import java.util.List;
import java.util.PriorityQueue;

public class Exercise2 {
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<>(List.of("Purple", "Green", "Red"));

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
