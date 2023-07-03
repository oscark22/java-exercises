import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        try {
            readFile("./exceptions/src/empty.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found. " + e.getMessage());
        } catch (FileIsEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    static void readFile(String fileName) throws FileNotFoundException, FileIsEmptyException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        if (!scanner.hasNextLine()) {
            throw new FileIsEmptyException("The file is empty.");
        }
    }
}

class FileIsEmptyException extends Exception {
    public FileIsEmptyException(String message) {
        super(message);
    }
}