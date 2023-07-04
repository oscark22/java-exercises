import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Exercise12 {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>(Collections.reverseOrder()); // maxPQ
        numbers.addAll(List.of(-5,-8,-91,12,38,7));

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
