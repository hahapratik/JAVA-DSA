/**
 * This class provides a method to convert a decimal number to its binary representation.
 */
public class DecimalToBinary {

    /**
     * Converts a decimal number to its binary equivalent and prints the result.
     *
     * @param n The decimal number to be converted to binary.
     */
    public static void DecToBin(int n) {
        // Store the original number for display purposes
        int MyNum = n;

        // Initialize the power variable to track the position in the binary number
        int pow = 0;

        // Initialize the binary number result to 0
        int binNum = 0;

        // Loop until the number becomes 0
        while (n > 0) {
            // Get the remainder when dividing by 2 (binary digit)
            int rem = n % 2;

            // Add the binary digit to the result at the correct position
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            // Increment the power for the next binary digit position
            pow++;

            // Divide the number by 2 to process the next digit
            n = n / 2;
        }

        // Print the binary representation of the original number
        System.out.println("Binary form of " + MyNum + " = " + binNum);
    }

    /**
     * The main method to test the DecToBin method.
     *
     * @param args Command-line arguments (not used in this program).
     */
}