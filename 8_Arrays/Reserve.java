
// Class to demonstrate reversing an array
public class Reserve {

    // Method to reverse the elements of an array
    public static void reserve(int number[]) {
        int first = 0, last = number.length - 1; // Initialize pointers for the start and end of the array
        while (first < last) { // Loop until the pointers meet in the middle
            int temp = number[last]; // Store the last element in a temporary variable
            number[last] = number[first]; // Assign the first element to the last position
            number[first] = temp; // Assign the temporary variable (last element) to the first position
            first++; // Move the first pointer forward
            last--; // Move the last pointer backward
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14 }; // Initialize an array with sample values
        reserve(number); // Call the reserve method to reverse the array
        for (int i = 0; i < number.length; i++) { // Loop through the array to print its elements
            System.out.print(number[i] + " "); // Print each element of the reversed array
        }
    }
}