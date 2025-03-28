/**
 * This class provides methods to calculate the factorial of a number
 * and compute the binomial coefficient (n choose k).
 */
public class BinomialCofficient {

    /**
     * Calculates the factorial of a given number.
     * 
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static int fact(int n) {
        int f = 1;
        // Loop to calculate factorial by multiplying numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    /**
     * Calculates the binomial coefficient (n choose k) using the formula:
     * C(n, k) = n! / (k! * (n-k)!)
     * 
     * @param a The total number of items (n).
     * @param b The number of items to choose (k).
     * @return The binomial coefficient C(n, k).
     */
    public static int BinoCoff(int a, int b) {
        // Calculate factorial of a
        int fact_a = fact(a);
        // Calculate factorial of b
        int fact_b = fact(b);
        // Calculate factorial of (a-b)
        int fact_aMb = fact(a - b);
        // Calculate binomial coefficient using the formula
        int bc = fact_a / (fact_b * fact_aMb);
        return bc;
    }

    /**
     * The main method to test the binomial coefficient calculation.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Print the binomial coefficient for n=5 and k=2
        System.out.println(BinoCoff(5, 2));
    }
}
