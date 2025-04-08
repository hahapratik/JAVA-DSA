/**
 * PrimeOrNot Class
 * 
 * This class contains a method to check whether a given number is prime or not.
 * It also includes a main method to test the functionality of the isPrime method.
 */
public class PrimeOrNot {

    /**
     * Method: isPrime
     * 
     * This method checks if a given number is a prime number.
     * 
     * @param n The number to be checked for primality.
     * @return A boolean value: true if the number is prime, false otherwise.
     * 
     * Steps:
     * 1. Initialize a boolean variable `isPrime` to true, assuming the number is prime.
     * 2. Use a for loop to iterate from 2 to n-1.
     *    - If the number is divisible by any number in this range, set `isPrime` to false and break the loop.
     * 3. Return the value of `isPrime`.
     */
    public static boolean isPrime(int n) {
        boolean isPrime = true; // Step 1: Assume the number is prime initially.
        for (int i = 2; i <= n - 1; i++) { // Step 2: Check divisors from 2 to n-1.
            if (n % i == 0) { // If divisible, it's not a prime number.
                isPrime = false; // Update isPrime to false.
                break; // Exit the loop as we found a divisor.
            }
        }
        return isPrime; // Step 3: Return the result.
    }

    /**
     * Method: main
     * 
     * This is the entry point of the program.
     * It tests the isPrime method by passing a sample number and printing the result.
     * 
     * Steps:
     * 1. Call the isPrime method with the number 5.
     * 2. Print the result to the console.
     */
    public static void main(String[] args) {
        System.out.println(isPrime(10)); // Step 1: Test the isPrime method with 5 and print the result.
    }
}
   
