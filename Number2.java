public class Number2 {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 7, 1, 7, 7, 2, 4, 7, 6};
        int count = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 7) {
                count++;
            }
        }

        System.out.println("The number 7 appears " + count + " times.");
    }
}