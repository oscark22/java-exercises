import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        try {
            readFile("./exceptions/src/doc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error. File not found. " + e.getMessage());
        } catch (PositiveNumberException e) {
            System.out.println("Error. Positive number found: " + e.getNumber() + ".");
            System.out.println("Found in line: " + e.getLineNumber() + ".");
        } catch (InputMismatchException e) {
            System.out.println("Error. Unexpected input mismatch in file.");
        }
    }

    static void readFile(String fileName) throws FileNotFoundException, InputMismatchException, PositiveNumberException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        int currLine = 0;
        while (scanner.hasNextLine()) {
            int number = scanner.nextInt();
            if (number > 0) {
                throw new PositiveNumberException(number, currLine);
            }
            currLine++;
        }
    }
}

class PositiveNumberException extends Exception {
    private final int number;
    private final int lineNumber;

    public PositiveNumberException(int number, int lineNumber) {
        this.number = number;
        this.lineNumber = lineNumber;
    }

    public int getNumber() {
        return number;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}
