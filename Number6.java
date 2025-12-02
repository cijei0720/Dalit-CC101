public class Number6 {
    public static void main(String[] args) {
        int[] numbers = {3, 99, 7, 8, 5, 12, 9};
        
        int sum = 0;
        int count = 0;

        for (int n : numbers) {
            if (n % 2 != 0) {     
                sum += n;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of odd numbers: " + average);
        } else {
            System.out.println("No odd numbers found.");
        }
    }
}
