/**
 * The Multiplication class provides a method to multiply two integers and print the result.
 */
public class Multiplication {

    /**
     * Multiplies two integers and prints the result.
     *
     *b the second integer to be multiplied
     * @return the product of a and b
     */
    public static int mul(int a, int b) {
        // Calculate the product of a and b
        int m = a * b;
        
        // Print the result of the multiplication
        System.out.println("Multiplication of a and b = " + m);
        
        // Return the product
        return m;
    }

    /**
     * The main method to test the multiplication method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Call the mul method with 2 and 3 as arguments
        mul(2, 3);
    }
}
