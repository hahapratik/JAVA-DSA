import java.util.*;

public class LargestNum {
    // Method to find the largest and smallest numbers in an array
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer value
        int smallest = Integer.MAX_VALUE; // Initialize smallest to the largest possible integer value

        // Loop through the array to find the largest and smallest numbers
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) { // Check if the current number is greater than the largest
                largest = numbers[i]; // Update the largest number
            }
            if (smallest > numbers[i]) { // Check if the current number is smaller than the smallest
                smallest = numbers[i]; // Update the smallest number
            }
        }
        System.out.println("Smallest Value is : " + smallest); // Print the smallest value
        return largest; // Return the largest value
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 6, 3, 5 }; // Initialize an array of integers
        System.out.println("Largest value is " + getLargest(numbers)); // Call the method and print the largest value
    }
}