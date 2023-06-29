import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Orange");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
