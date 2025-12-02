public class Number5 {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 12, 5, 99, 14};
        int target = 5;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                break;
            }
        }
    }
}
