import java.util.Scanner;

public class Number15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; 

        // Ask the user for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        System.out.println("Numbers greater than 50:");
        for (int num : numbers) {
            if (num > 50) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
