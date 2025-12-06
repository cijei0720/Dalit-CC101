import java.util.Scanner;

public class Number9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.print("Enter a number (0 to stop): ");
        number = scanner.nextInt();

        while (number != 0) {
            sum += number;

            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();
        }

        System.out.println("The total sum is: " + sum);
    }
}
