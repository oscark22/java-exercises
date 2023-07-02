import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1,2,3,3,3,3,4,4,5 };

        int[] distinctNumbers = Arrays.stream(numbers).distinct().toArray();
        System.out.println(Arrays.toString(distinctNumbers));
    }
}
