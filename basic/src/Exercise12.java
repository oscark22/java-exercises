import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Input the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Input the third number:");
        int num3 = scanner.nextInt();

        System.out.println((num1+num2+num3) / 3);
    }
}
