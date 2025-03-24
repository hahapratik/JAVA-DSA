/**
 * This class provides a method to add two integers and print the result.
 */
import java.util.*;
public class Sum2 {

    /**
     * Adds two integers and prints the sum.
     *
     * x the first integer
     * y the second integer
     */
    public static void add(int x, int y) {
        int sum = x + y; // Calculate the sum of x and y
        System.out.println("Sum is = " + sum); // Print the sum
    }

    /**
     * The main method to execute the program.
     * It prompts the user to enter two integers and then calls the add method.
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        {
            System.out.print("Enter the First number: "); // Prompt user for the first number
            int a = sc.nextInt(); // Read the first number
            System.out.print("Enter the Second number: "); // Prompt user for the second number
            int b = sc.nextInt(); // Read the second number
            add(a, b); // Call the add method with the two numbers
        }sc.close();
        
    }
}
