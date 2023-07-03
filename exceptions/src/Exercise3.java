import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }

    static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }
}
