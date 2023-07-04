import java.util.Arrays;
import java.util.HashSet;

public class StringMethods {
    public static void main(String[] args) {
        String text = "A man, a plan, a canal, Panama!";

        System.out.println("length: " + text.length());
        System.out.println("toUpperCase: " + text.toUpperCase());
        System.out.println("toLowerCase: " + text.toLowerCase());
        System.out.println("indexOf: " + text.indexOf("a"));
        System.out.println("charAt: " + text.indexOf(0) + text.indexOf(100));
        System.out.println("toCharArray: " + Arrays.toString(text.toCharArray()));
        System.out.println("replace: " + text.replace("a", "e"));
        System.out.println("substring: " + text.substring(0, 5));
        System.out.println("split: " + Arrays.toString(text.split(",")));
        System.out.println("compareTo: " + text.compareTo("a man"));
        System.out.println("strip: " + text.strip());
        System.out.println("valueOf: " + String.valueOf(text.toCharArray()));
    }
}
