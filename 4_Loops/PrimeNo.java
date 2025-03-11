
import java.util.Scanner; // Import the Scanner class for user input

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        int n = sc.nextInt(); // Read an integer input from the user

        boolean isPrime = true; // Assume the number is prime
        for (int i = 2; i <= Math.sqrt(n); i++) { // Loop from 2 to the square root of n
            if (n % i == 0) { // Check if n is divisible by i
                isPrime = false; // If divisible, n is not prime
                break; // Exit the loop as we found a divisor
            }
        }
        if (isPrime == true) { // If isPrime is still true
            System.out.println("N is prime"); // Print that n is prime
        } else {
            System.out.println("N is not prime"); // Otherwise, print that n is not prime
        }
    }
}