public class Number7 {
    public static void main(String[] args) {
        int[] numbers = {5, -12, 7, -3, -25, 9};

        System.out.println("Original array:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.abs(numbers[i]);
        }

        System.out.println("\n\nArray after converting negatives to positive:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
