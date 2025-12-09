import java.util.Scanner;

public class Number19 {
    public static void main(String[] args) {
        
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        int[] grades = {85, 92, 78, 90};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String inputName = scanner.nextLine();

        boolean found = false;

        
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(inputName)) { 
                System.out.println(inputName + "'s grade is: " + grades[i]);
                found = true;
                break; 
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        scanner.close();
    }
}
