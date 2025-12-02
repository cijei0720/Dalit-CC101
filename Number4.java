public class Number4 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 7, 24, 4, 9};

        int smallest = numbers[0];
        int largest  = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
