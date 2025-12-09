import java.util.HashSet;

public class Number18 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 3, 7};

        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicates = false;

        for (int num : arr) {
            if (set.contains(num)) {
                hasDuplicates = true;
                break; 
            } else {
                set.add(num);
            }
        }

        if (hasDuplicates) {
            System.out.println("Array contains duplicates.");
        } else {
            System.out.println("Array does not contain duplicates.");
        }
    }
}
