/**
 * Question: Check if a given number is even or odd.
 *
 * This program takes an integer input from the user and determines whether the number is even or odd.
 * It uses a helper method `isEven` to perform the check and prints the result accordingly.
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Step 1: Declare a variable to store the input number.
        int n;

        // Step 2: Create a Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Step 3: Prompt the user to enter a number.
        System.out.println("Enter the number : ");

        // Step 4: Read the integer input from the user.
        n = sc.nextInt();

        // Step 5: Close the Scanner object to prevent resource leaks.
        sc.close();

        // Step 6: Check if the number is even using the isEven method and print the result.
        if (isEven(n)) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is odd");
        }
    }

    /**
     * Method: isEven
     * This method checks if a given number is even.
     *
     * @param num The integer to check.
     * @return true if the number is even, false otherwise.
     */
    public static boolean isEven(int num) {
        // Step 7: Check if the number is divisible by 2.
        if (num % 2 == 0) {
            return true; // Return true if the number is even.
        } else {
            return false; // Return false if the number is odd.
        }
    }
}
