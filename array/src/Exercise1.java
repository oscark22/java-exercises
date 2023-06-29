import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = { 2, 3, 4, 5, 11, -1, 4, 3, 5 };
        String[] strings = { "a", "c", "z", "i", "o", "b" };

        Arrays.sort(numbers);
        Arrays.sort(strings);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(strings));
    }
}
