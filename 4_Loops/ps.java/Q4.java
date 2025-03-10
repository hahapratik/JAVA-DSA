/**
 * === Q4 Program Documentation ===
 *
 * This program demonstrates how to reverse the digits of a given number.
 */
public class Q4 {
    public static void main(String[] args) {
        // Step 1: Declaration and Initialization
        // Initialize an integer 'n' with the value 2042004.
        int n = 2042004;

        // Step 2: Processing Using a While Loop
        // The loop executes as long as 'n' is greater than 0.
        while (n > 0) {

            // Step 2a: Extract the Last Digit
            // Get the last digit by using modulus operator.
            int lastno = n % 10;

            // Step 2b: Print the Extracted Digit
            // Output the digit immediately.
            System.out.print(lastno);

            // Step 2c: Update the Number
            // Remove the last digit by performing integer division by 10.
            n /= 10;
        }

        // Step 3: Termination
        // Once 'n' becomes 0, all digits have been processed.
    }
}

