public class Number12 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 7, 5, 9};
        int valueToCheck = 5;

        int count = 0;
        for (int num : arr) {
            if (num == valueToCheck) {
                count++;
                if (count >= 3) { 
                    break;
                }
            }
        }

        if (count >= 3) {
            System.out.println(valueToCheck + " appears at least 3 times.");
        } else {
            System.out.println(valueToCheck + " appears less than 3 times.");
        }
    }
}
