public class Number10 {
    public static void main(String[] args) {
        int[] numbers = {7, 13, 9, 21, 4, 10, 5};

        int index = -1;

        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {  
                index = i;              
                break;                  
            }
        }

        if (index != -1) {
            System.out.println("The first even number is at index: " + index);
            System.out.println("The value is: " + numbers[index]);
        } else {
            System.out.println("There is no even number in the array.");
        }
    }
}
