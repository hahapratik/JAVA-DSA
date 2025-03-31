/**
 * This class provides a method to convert a binary number to its decimal equivalent.
 */
public class BinaryToDecimal {

    /**
     * Converts a binary number to its decimal equivalent and prints the result.
     *
     * @param binNum The binary number to be converted (as an integer).
     *               Each digit of the binary number should be either 0 or 1.
     */
    public static void BinToDec(int binNum) {
        // Store the original binary number for display purposes
        int myNum = binNum;

        // Initialize the power of 2 (starting from 0)
        int pow = 0;

        // Initialize the decimal number result
        int decNum = 0;

        // Loop through each digit of the binary number
        while (binNum > 0) {
            // Extract the last digit of the binary number
            int lastdigit = binNum % 10;

            // Add the contribution of the last digit to the decimal number
            // Multiply the last digit by 2 raised to the current power
            decNum = decNum + (lastdigit * (int) Math.pow(2, pow));

            // Increment the power for the next binary digit
            pow++;

            // Remove the last digit from the binary number
            binNum = binNum / 10;
        }

        // Print the decimal equivalent of the binary number
        System.out.println("Decimal of " + myNum + " = " + decNum);
    }

    /**
     * The main method to test the binary-to-decimal conversion.
     *
     * @param args Command-line arguments (not used here).
     */
    public static void main(String[] args) {
        // Test the BinToDec method with a sample binary number (101 in binary)
        BinToDec(101);
    }
}
