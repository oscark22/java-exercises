import java.util.ArrayList;

public class Exercise7 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        colors.add("Purple");

        int idx = colors.indexOf("Red");
        System.out.println(idx);
    }
}
