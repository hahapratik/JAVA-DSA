/**
 * Question: Check if a given number is a Palindrome
 * 
 * This program checks whether a given integer is a palindrome or not.
 * A palindrome is a number that reads the same backward as forward.
 */

import java.util.Scanner;

public class Q3 {
    // PALINDROME
    public static void main(String[] args) {
        /**
         * Step 1: Declare a variable `n` to store the input number.
         * Step 2: Create a Scanner object to take user input.
         * Step 3: Prompt the user to enter a number and store it in `n`.
         */
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = sc.nextInt();
        sc.close();
        /**
         * Step 4: Call the `isPalindrome` method to check if the number is a palindrome.
         * Step 5: Print the result based on the boolean value returned by `isPalindrome`.
         */
        if (isPalindrome(n)) {
            System.out.println("Number : " + n + " is a Palindrome");
        } else {
            System.out.println("Number : " + n + " is not a Palindrome");
        }
    } 

    /**
     * Method: isPalindrome
     * 
     * This method checks if a given number is a palindrome.
     * 
     * @param num The number to be checked.
     * @return true if the number is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(int num){
        /**
         * Step 1: Store the original number in a variable `Palindrome`.
         * Step 2: Initialize a variable `reverse` to 0 to store the reversed number.
         */
        ;
        int Palindrome = num;
        int reverse = 0;

        /**
         * Step 3: Use a while loop to reverse the digits of the number.
         * - Extract the last digit using modulus operator (%).
         * - Add the digit to `reverse` after shifting its digits to the left.
         * - Remove the last digit from `Palindrome` using division operator (/).
         */
        while (Palindrome != 0) {
            int reminder = Palindrome % 10;
            reverse = reverse * 10 + reminder;
            Palindrome = Palindrome / 10;

            /**
             * Step 4: Check if the reversed number matches the original number.
             * If they match, return true (indicating the number is a palindrome).
             */
            if ( num == reverse){
                return true;
            }
        }
        /**
         * Step 5: If the loop completes and no match is found, return false.
         */
        return false;
       
    }
}
