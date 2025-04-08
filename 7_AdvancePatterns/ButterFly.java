public class ButterFly {
    // Method to print the butterfly pattern
    public static void butterfly(int n) {
        // First half of the butterfly pattern
        for (int i = 1; i <= n; i++) {
            // Print stars on the left side
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print a star
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" "); // Print a space
            }
            // Print stars on the right side
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line
        }

        // Second half of the butterfly pattern
        for (int i = n; i >= 1; i--) {
            // Print stars on the left side
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print a star
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" "); // Print a space
            }
            // Print stars on the right side
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        butterfly(5); // Call the butterfly method with n = 5
    }
}
