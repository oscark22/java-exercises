import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        String[] names = new String[] { "Diego", "Diana", "Alberto" };

        List<String> upperNames = Arrays.stream(names).map(String::toUpperCase).toList();
        System.out.println(upperNames);

        List<String> lowerNames = Arrays.stream(names).map(String::toLowerCase).toList();
        System.out.println(lowerNames);
    }
}
