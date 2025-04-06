/**
 * Question: Write a program to calculate the sum of the digits of a given integer.
 * 
 * This program takes an integer input from the user and calculates the sum of its digits.
 * It uses a helper method `sumDigits` to perform the calculation.
 */

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Step 2: Read an integer input from the user.
        int n = sc.nextInt();

        // Step 3: Call the sumDigits method to calculate the sum of the digits of the input number.
        // Step 4: Print the result to the console.
        System.out.println("The sum is " + sumDigits(n));

        // Step 5: Close the Scanner object to release resources.
        sc.close();
    };

    /**
     * Method: sumDigits
     * This method calculates the sum of the digits of a given integer.
     * 
     * @param a The integer whose digits are to be summed.
     * @return The sum of the digits of the input integer.
     */
    public static int sumDigits(int a){
        // Step 1: Initialize a variable to store the sum of the digits.
        int sumOfDigits = 0;

        // Step 2: Use a while loop to extract each digit of the number.
        while (a > 0) {
            // Step 3: Extract the last digit of the number using the modulo operator.
            int lastDigit = a % 10;

            // Step 4: Add the extracted digit to the sumOfDigits variable.
            sumOfDigits += lastDigit;

            // Step 5: Remove the last digit from the number by dividing it by 10.
            a /= 10;
        }

        // Step 6: Return the calculated sum of the digits.
        return sumOfDigits;
    }
}
