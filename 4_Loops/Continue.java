
/*
 * ===============================
 * Question: Explanation of Steps in Continue.java Code
 * This code demonstrates the use of the "continue" statement within a loop.
 * Each step is explained in the comments following the code lines.
 * ===============================
 */

public class Continue {
    public static void main(String[] args) {
        // Start of the for loop: Initialize i to 1, and continue looping while i is less or equal to 10.
        for (int i = 1; i <= 10; i++) {
            // If i equals 3, the following block gets executed.
            if (i == 3) {
                // Skip the rest of this iteration when i is 3 using the 'continue' statement.
                continue;
            }
            // Print the value of i if it is not equal to 3.
            System.out.println(i);
        }
        // End of for loop and main method.
    }
}
