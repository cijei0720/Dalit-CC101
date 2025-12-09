public class Number20 {
    public static void main(String[] args) {
        int[] numbers = {10, 22, 15, 40, 18, 55, 60};

        System.out.println("Even numbers greater than 20:");
        for (int num : numbers) {
            if (num > 20 && num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
