import java.util.ArrayList;
import java.util.Collections;

public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");

        Collections.sort(colors);
        System.out.println(colors);
    }
}
