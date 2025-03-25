/**
 * The TempFunction class contains a method to swap two integers and print their values.
 */
public class TempFunction {

    /**
     * Swaps the values of two integers and prints the swapped values.
     *
     * @param a the first integer to be swapped
     * @param b the second integer to be swapped
     */
    public static void InnerTempFunction(int a, int b) {
        // Store the value of 'a' in a temporary variable
        int temp = a;
        
        // Assign the value of 'b' to 'a'
        a = b;
        
        // Assign the value of the temporary variable to 'b'
        b = temp;
        
        // Print the swapped values
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /**
     * The main method to execute the InnerTempFunction with sample values.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Call the InnerTempFunction with sample values 21 and 23
        InnerTempFunction(21, 23);
    }
}
