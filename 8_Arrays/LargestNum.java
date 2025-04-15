/**
 * Question: Find the largest number in an array
 * 
 * This program defines a method to find the largest number in a given array of integers.
 * It iterates through the array, compares each element, and determines the largest value.
 */

import java.util.*;

public class LargestNum {

    /**
     * Method: getLargest
     * 
     * This method takes an integer array as input and returns the largest number in the array.
     * 
     * @param number The array of integers to find the largest number from.
     * @return The largest integer in the array.
     */
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE; // Initialize the largest variable to the smallest possible integer value.
        // This ensures that any number in the array will be larger than this initial value.

        for (int i = 0; i < number.length; i++) { // Loop through each element in the array.
            if (largest < number[i]) { // Compare the current element with the largest value found so far.
                largest = number[i]; // Update the largest value if the current element is greater.
            }
        }
        return largest; // Return the largest value found in the array.
    }

    /**
     * Main Method
     * 
     * This is the entry point of the program. It initializes an array of integers,
     * calls the getLargest method, and prints the largest value in the array.
     */
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 6, 3, 5}; // Initialize an array of integers.
        System.out.println("Largest value is " + getLargest(number)); // Print the largest value in the array.
    }
}
