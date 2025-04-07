/**
 * ### Inverted and Rotated Half Pyramid
 * 
 * This program generates an inverted and rotated half pyramid pattern using stars ('*').
 * The pattern is created by printing spaces and stars in a specific order for a given number of rows.
 * 
 * Example for n = 4:
 * 
 *    *
 *   **
 *  ***
 * ****
 * 
 * The program consists of a method `ultaHalfPeramid` that handles the logic for generating the pattern,
 * and a `main` method that calls this function with a specific input.
 */
public class InvertedAndRotatedHalfPeramid {

    /**
     * Generates an inverted and rotated half pyramid pattern.
     * 
     * @param n The number of rows for the pyramid.
     * 
     * Steps:
     * 1. Outer loop iterates over the rows (from 1 to n).
     * 2. Inner loop 1 prints spaces (' ') to create the rotated effect.
     * 3. Inner loop 2 prints stars ('*') for the current row.
     * 4. Moves to the next line after printing spaces and stars for the current row.
     */
    public static void ultaHalfPeramid(int n) {
        for (int i = 1; i <= n; i++) { // Loop for each row
            for (int j = 1; j <= n - i; j++) { // Loop to print spaces
                System.out.print(" "); // Print space for alignment
            }
            for (int j = 1; j <= i; j++) { // Loop to print stars
                System.out.print("*"); // Print star for the current row
            }
            System.out.println(); // Move to the next line after completing the row
        }
    }

    /**
     * Main method to execute the program.
     * 
     * Steps:
     * 1. Calls the `ultaHalfPeramid` method with a specific input (e.g., 4).
     * 2. The pattern is printed to the console.
     */
    public static void main(String[] args) {
        ultaHalfPeramid(4); // Generate and print the pattern for 4 rows
    }
}
