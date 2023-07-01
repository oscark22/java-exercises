import java.util.ArrayList;

public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Purple");
        colors.add("Green");

        colors.remove(2);
        System.out.println(colors);
    }
}
