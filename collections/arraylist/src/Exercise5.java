import java.util.ArrayList;

public class Exercise5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Purple");
        colors.add("Orange");

        colors.set(0, "Green");
        System.out.println(colors.toString());
    }
}
