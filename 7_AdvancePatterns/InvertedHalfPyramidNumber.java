
/**
 * # Inverted Half Pyramid of Numbers
 *
 * This program generates an inverted half pyramid pattern of numbers based on user input.
 * The pyramid starts with numbers from 1 to n in the first row, and each subsequent row
 * reduces the count of numbers by one until the last row contains only the number 1.
 *
 * ## Class Definition
 * The class `InvertedHalfPyramidNumber` contains the main method and a helper method
 * to generate the pyramid pattern.
 */

/**
 * Method: InvHlfPydNum
 * This method generates and prints an inverted half pyramid of numbers.
 *
 * @param n The number of rows for the pyramid.
 *
 * Steps:
 * 1. **Outer Loop**: Iterates through the rows of the pyramid.
 *    - Starts from 1 and goes up to `n` (inclusive).
 * 2. **Inner Loop**: Prints numbers in each row.
 *    - Starts from 1 and goes up to `n - i + 1`, where `i` is the current row number.
 *    - This ensures that the number of elements decreases with each row.
 * 3. **Print Statement**: Prints the current number followed by a space.
 * 4. **Line Break**: Moves to the next line after completing a row.
 */

/**
 * Main Method
 * The entry point of the program.
 *
 * Steps:
 * 1. **Scanner Initialization**: Creates a `Scanner` object to read user input.
 * 2. **User Input**: Prompts the user to enter the number of rows for the pyramid.
 * 3. **Method Call**: Calls the `InvHlfPydNum` method with the user-provided input.
 * 4. **Scanner Closure**: Closes the `Scanner` object to release resources.
 */
// Define the class for the program

import java.util.Scanner;

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
        // trying the scanner thing in methods for the first time and yes its sccess
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
            int a = sc.nextInt();
            sc.close();
        
        InvHlfPydNum(a); // Call the method with 5 rows
    }
}