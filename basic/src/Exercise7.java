import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce the first number:");
        int number = scanner.nextInt();

        for(int i=1; i<11; i++) {
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}
