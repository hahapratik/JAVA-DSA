// Importing the required package for input-output operations
// This allows the program to use System.out for printing to the console.
public class ZeroOneTriangle {

    // Method to print a zero-one triangle pattern
    public static void zeroOneTriangle(int n) {
        // Outer loop for the number of rows (1 to n)
        for (int i = 1; i <= n; i++) {
            // Inner loop for the number of columns in the current row (1 to i)
            for (int j = 1; j <= i; j++) {
                // Check if the sum of the current row and column indices is even
                if ((i + j) % 2 == 0) {
                    // Print "1" if the sum is even
                    System.out.print("1 ");
                } else {
                    // Print "0" if the sum is odd
                    System.out.print("0 ");
                }
            }
            // Move to the next line after completing the current row
            System.out.println();
        }
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Call the zeroOneTriangle method with n = 5 to print a triangle of 5 rows
        zeroOneTriangle(5);
    }
}
