/**
 * Linear Search Implementation in Java
 * 
 * This program demonstrates the implementation of the Linear Search algorithm.
 * Linear Search is a simple searching algorithm that checks each element in the array
 * sequentially until the desired element (key) is found or the end of the array is reached.
 * 
 * Steps:
 * 1. Define a method `linearSearch` that takes an array and a key as input.
 * 2. Iterate through the array to compare each element with the key.
 * 3. If the key is found, return its index; otherwise, return -1.
 * 4. In the `main` method, define an array and a key to search for.
 * 5. Call the `linearSearch` method and print the result based on the returned index.
 */
 

// Class Definition
// This class contains the implementation of the Linear Search algorithm.
public class LinearSearch {

    /**
     * Linear Search Method
     * 
     * @param num The array of integers to search in.
     * @param key The integer value to search for.
     * @return The index of the key if found; otherwise, -1.
     * 
     * Steps:
     * 1. Iterate through the array using a for loop.
     * 2. Compare each element of the array with the key.
     * 3. If a match is found, return the current index.
     * 4. If no match is found after the loop, return -1.
     */
    public static int linearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) { // Loop through the array
            if (num[i] == key) { // Check if the current element matches the key
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    /**
     * Main Method
     * 
     * This is the entry point of the program.
     * 
     * Steps:
     * 1. Define an array of integers `num`.
     * 2. Define the key to search for in the array.
     * 3. Call the `linearSearch` method with the array and key as arguments.
     * 4. Check the returned index:
     *    - If the index is -1, print "NOT FOUND".
     *    - Otherwise, print the index of the key.
     */
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14, 16 }; // Define the array
        int key = 12; // Define the key to search for
        int index = linearSearch(num, key); // Call the linearSearch method
        if (index == -1) { // Check if the key was not found
            System.out.println("NOT FOUND"); // Print "NOT FOUND" if the key is not in the array
        } else {
            System.out.println("Key is at Index : " + index); // Print the index of the key if found
        }
    }
}
