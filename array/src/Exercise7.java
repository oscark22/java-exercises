import java.util.Arrays;
import java.util.stream.IntStream;

public class Exercise7 {
    public static void main(String[] args) {
        int[] numbers = { 25, 14, 2, 6, 92, 71, 24 };
        int[] newNumbers = new int[numbers.length - 1];

        // with given index
        int targetIdx = 2;
        for (int i=0, k=0; i<numbers.length; i++) {
            if (i == targetIdx) continue;
            newNumbers[k] = numbers[i];
            k++;
        }
        System.out.println(Arrays.toString(newNumbers));

        // with given value in place
        targetIdx = IntStream.range(0, numbers.length)
                .filter(i -> 2 == numbers[i])
                .findFirst()
                .orElse(-1);

        for (int i=targetIdx; i<numbers.length-1; i++) {
            numbers[i] = numbers[i+1];
        }
        System.out.println(Arrays.toString(numbers));
    }
}
