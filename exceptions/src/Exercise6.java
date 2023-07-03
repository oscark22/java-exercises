import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Exercise6 {
    public static void main(String[] args) {
        try {
            readIntegers(5);
        } catch (DuplicateNumberException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception. Int expected.");
        }
    }

    static void readIntegers(int iterations) throws InputMismatchException, DuplicateNumberException {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < iterations; i++) {
            int number = scanner.nextInt();
            if (seen.contains(number)) {
                throw new DuplicateNumberException("Number already seen.");
            }
            seen.add(number);
        }
    }
}

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}