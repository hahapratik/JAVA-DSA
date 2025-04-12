// Define a class named HollowRhombus
public class HollowRhombus {

    // Method to print a hollow rhombus pattern
    public static void Hollow_Rhombus(int n) {
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop to print leading spaces for alignment
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" "); // Print a space
            }
            // Inner loop to print the stars and spaces for the rhombus
            for (int j = 1; j <= n; j++) {
                // Check if it's the border of the rhombus
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*"); // Print a star for the border
                } else {
                    System.out.print(" "); // Print a space for the hollow part
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Hollow_Rhombus(5); // Call the method with size 5
    }
}