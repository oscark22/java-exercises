import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the width:");
        double num1 = scanner.nextDouble();

        System.out.println("Input the height:");
        double num2 = scanner.nextDouble();

        System.out.println(num1*2 + num2*2);
        System.out.println(num1 * num2);
    }
}
