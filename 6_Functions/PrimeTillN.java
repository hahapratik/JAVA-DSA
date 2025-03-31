
/**
 * This class contains methods to check for prime numbers and print all prime
 * numbers up to a given range.
 */
public class PrimeTillN {

    /**
     * Checks if a given number is prime.
     * 
     * @param n The number to check for primality.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        // Special case: 2 is the smallest and only even prime number.
        if (n == 2) {
            return true;
        }

        // Loop from 2 to the square root of n to check for factors.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // If n is divisible by any number in this range, it is not prime.
            if (n % i == 0) {
                return false;
            }
        }

        // If no factors are found, the number is prime.
        return true;
    }

    /**
     * Prints all prime numbers in the range from 1 to n.
     * 
     * @param n The upper limit of the range to check for prime numbers.
     */
    public static void PrimeInRange(int n) {
        // Iterate through all numbers from 1 to n.
        for (int i = 1; i <= n; i++) {
            // Check if the current number is prime.
            if (isPrime(i)) {
                // Print the prime number.
                System.out.print(i + " ");
            }
        }
        // Print a new line after all prime numbers are printed.
        System.out.println();
    }

    /**
     * The main method to execute the program.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Call the PrimeInRange method to print all prime numbers up to 100.
        PrimeInRange(100);
    }
}
