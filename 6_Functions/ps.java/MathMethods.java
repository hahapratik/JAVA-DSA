/**
 * ### Documentation for MathMethods Program
 *
 * This program demonstrates the usage of various mathematical methods provided by the `Math` class in Java.
 * It takes two double values as input from the user and performs the following operations:
 * 
 * 1. Finds the minimum of the two numbers.
 * 2. Finds the maximum of the two numbers.
 * 3. Calculates the square root of the first number.
 * 4. Calculates the power of the first number raised to the second number.
 * 5. Finds the absolute value of the first number.
 * 
 * The program uses the `Scanner` class to take user input and the `Math` class for mathematical operations.
 */

import java.util.Scanner; // Importing Scanner class for user input

public class MathMethods {
    public static void main(String[] args) {
        double a, b; // Declaring variables to store user input

        // Initializing Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter the first number
        System.out.print("Enter the First number : ");
        a = sc.nextDouble(); // Reading the first number as a double

        // Prompting the user to enter the second number
        System.out.print("Enter the Second number : ");
        b = sc.nextDouble(); // Reading the second number as a double

        // Finding and displaying the minimum of the two numbers
        System.out.println("The Minimum of These two numbers is : " + Math.min(a, b));

        // Finding and displaying the maximum of the two numbers
        System.out.println("The Maximum of These two numbers is : " + Math.max(a, b));

        // Calculating and displaying the square root of the first number
        System.out.println("The Square Root of A is : " + Math.sqrt(a));

        // Calculating and displaying the result of raising the first number to the power of the second number
        System.out.println("Power : " + Math.pow(a, b));

        // Finding and displaying the absolute value of the first number
        System.out.println("Absolute of these numbers : " + Math.abs(a));

        // Closing the Scanner object to release resources
        sc.close();
    }
}
