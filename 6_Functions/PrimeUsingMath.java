public class PrimeUsingMath { 
    // This is the main class named 'PrimeUsingMath'. It contains methods to check if a number is prime.

    public static boolean isPrime(int n) { 
        // This is a static method named 'isPrime' that takes an integer 'n' as input and returns a boolean.
        // It checks whether the given number 'n' is a prime number.

        if (n == 2) { 
            // Special case: If the number is 2, it is a prime number.
            return true; 
        }

        for (int i = 2; i <= Math.sqrt(n); i++) { 
            // This loop starts from 2 and goes up to the square root of 'n'.
            // The square root optimization reduces the number of iterations, improving efficiency.
            if (n % i == 0) { 
                // If 'n' is divisible by 'i', it means 'n' is not a prime number.
                return false; 
            }
        }

        return true; 
        // If no divisors are found, the number is prime, so return true.
    }

    public static void main(String[] args) { 
        // This is the main method, the entry point of the program.

        System.out.println(isPrime(9)); 
        // Calls the 'isPrime' method with the input 9 and prints the result.
        // In this case, it will print 'false' because 9 is not a prime number.
    }
}