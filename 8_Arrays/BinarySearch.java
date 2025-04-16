public class BinarySearch {
    // Method to perform binary search on a sorted array
    public static int binarySearch(int number[], int key) {
        int start = 0, end = number.length - 1; // Initialize start and end pointers

        // Loop until the start pointer crosses the end pointer
        while (start <= end) {
            int mid = (start + end) / 2; // Calculate the middle index

            if (number[mid] == key) { // Check if the middle element is the key
                return mid; // Return the index if the key is found
            }

            if (number[mid] < key) { // If the key is greater than the middle element
                start = mid + 1; // Move the start pointer to the right of mid
            } else { // If the key is smaller than the middle element
                end = mid - 1; // Move the end pointer to the left of mid
            }
        }

        return -1; // Return -1 if the key is not found in the array
    }

    public static void main(String[] args) {
        // Define a sorted array of integers
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };

        // Define the key to search for
        int key = 10;

        // Call the binarySearch method and print the result
        System.out.println("Index for key is : " + binarySearch(number, key));
    }
}
