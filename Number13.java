public class Number13 {
    public static void main(String[] args) {
        int[] grades = {80, 67, 90, 74, 85, 60, 77};

        int passed = 0;
        int failed = 0;

        for (int grade : grades) {
            if (grade >= 75) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("Number of students who passed: " + passed);
        System.out.println("Number of students who failed: " + failed);
    }
}
