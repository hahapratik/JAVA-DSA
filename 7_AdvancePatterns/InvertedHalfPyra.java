public class InvertedHalfPyra
// Define the class for the program
public class InvertedHalfPyramidNumber {

    // Method to print an inverted half pyramid of numbers
    public static void InvHlfPydNum(int n) {
        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " "); // Print the current number
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        InvHlfPydNum(5); // Call the method with 5 rows
    }
}