public class Number8 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = new int[A.length];

        
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        
        System.out.println("Array B from Array A:");
        for (int n : B) {
            System.out.print(n + " ");
        }
    }
}
