import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner tryagain = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a number between 1 and 100: ");
            number = tryagain.nextInt();

            if (number >= 1 && number <= 100) {
                break;
            }

            System.out.println("Invalid input! Try again.");
        }

        System.out.println("You entered: " + number);
    }
}