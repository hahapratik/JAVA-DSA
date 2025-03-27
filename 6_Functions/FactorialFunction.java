/**
 * This class contains a method to calculate the factorial of a given number
 * and a main method to demonstrate its usage.
 */
public class FactorialFunction {

    /**
     * Calculates the factorial of a given integer.
     * 
     * Steps:
     * 1. Initialize a variable `f` to 1, which will store the factorial result.
     * 2. Use a for loop to iterate from 1 to the given number `n`.
     * 3. Multiply `f` by the current loop index `i` in each iteration to compute the factorial.
     * 4. Return the computed factorial value.
     * 
     * @param n The number for which the factorial is to be calculated.
     *          It should be a non-negative integer.
     * @return The factorial of the given number `n`.
     */
    public static int factorial(int n) {
        int f = 1; // Initialize factorial result to 1.
        for (int i = 1; i <= n; i++) { // Loop from 1 to n.
            f = f * i; // Multiply current value of f by i.
        }
        return f; // Return the computed factorial.
    }

    /**
     * The main method to test the factorial function.
     * 
     * Steps:
     * 1. Call the `factorial` method with the argument 4.
     * 2. Print the result of the factorial calculation to the console.
     */
    public static void main(String[] args) {
        System.out.println(factorial(4)); // Print the factorial of 4.
    }
}
