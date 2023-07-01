import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Orange");

        colors.add(0, "Purple");
        System.out.println(colors);
    }
}
