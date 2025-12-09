public class Number17 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 89, 34};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second highest number.");
        } else {
            System.out.println("Second highest number is: " + secondMax);
        }
    }
}
