/**
 * Floyd's Triangle Generator
 * 
 * This program generates Floyd's Triangle up to a specified number of rows.
 * Floyd's Triangle is a right-angled triangular array of natural numbers,
 * used in computer science and mathematics.
 * 
 * Key Steps:
 * - The `FloydTrin` method generates the triangle by iterating through rows and
 * columns.
 * - A counter is used to populate the triangle with consecutive numbers.
 * - The `main` method calls the `FloydTrin` method with a specified number of
 * rows.
 */

public class FloydsTringle {

    /**
     * Generates Floyd's Triangle up to the given number of rows.
     * 
     * @param n The number of rows to generate in Floyd's Triangle.
     * 
     *          Steps:
     *          1. Initialize a counter to 1 to start numbering from 1.
     *          2. Use a nested loop:
     *          - Outer loop iterates through rows (from 1 to n).
     *          - Inner loop iterates through columns (from 1 to the current row
     *          number).
     *          3. Print the current counter value and increment it after each
     *          print.
     *          4. Print a newline after completing each row.
     */
    public static void FloydTrin(int n) {
        int counter = 1; // Initialize counter to start numbering from 1.
        for (int i = 1; i <= n; i++) { // Outer loop for rows.
            for (int j = 1; j <= i; j++) { // Inner loop for columns.
                System.out.print(counter + " "); // Print the current counter value.
                counter++; // Increment the counter.
            }
            System.out.println(); // Print a newline after each row.
        }
    }

    /**
     * Main method to execute the program.
     * 
     * Steps:
     * 1. Calls the `FloydTrin` method with the argument 10 to generate 10 rows of
     * Floyd's Triangle.
     */
    public static void main(String[] args) {
        FloydTrin(5); // Generate Floyd's Triangle with 10 rows.
    }
}
