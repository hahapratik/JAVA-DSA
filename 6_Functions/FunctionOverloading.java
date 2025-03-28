/**
 * This class demonstrates the concept of function overloading in Java.
 * Function overloading allows multiple methods in the same class to have the same name
 * but with different parameter lists (type, number, or both).
 */
public class FunctionOverloading {

    /**
     * Calculates the sum of two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     */
    public static int sum(int a, int b) {
        // Add two integers and return the result
        return a + b;
    }

    /**
     * Calculates the sum of three integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @param c The third integer.
     * @return The sum of the three integers.
     */
    public static int sum(int a, int b, int c) {
        // Add three integers and return the result
        return a + b + c;
    }

    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of overloaded sum methods.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Call the sum method with two arguments and print the result
        System.out.println(sum(2, 3)); // Expected output: 5

        // Call the sum method with three arguments and print the result
        System.out.println(sum(2, 3, 4)); // Expected output: 9
    }
}
