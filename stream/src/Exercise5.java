import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        String[] names = new String[] { "Daniel", "Danny", "Abraham", "Axel", "Bryan" };

        char targetLetter = 'd';
        long count = Arrays.stream(names)
                .map(String::toLowerCase)
                .filter(s -> s.startsWith(String.valueOf(targetLetter))).count();
        System.out.println(count);
    }
}
