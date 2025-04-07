// Question: Hollow Rectangle Pattern in Java
// This program prints a hollow rectangle pattern of '*' characters 
// based on the number of rows and columns provided.

public class HollowRectangle {

    // Method to print a hollow rectangle
    public static void hollow_rect(int Rows, int Cols) {
        // Outer loop for each row
        for (int i = 1; i <= Rows; i++) {
            // Inner loop for each column
            for (int j = 1; j <= Cols; j++) {
                // Check if the current position is on the boundary
                if (i == 1 || i == Rows || j == 1 || j == Cols) {
                    System.out.print("*"); // Print '*' for boundary positions
                } else {
                    System.out.print(" "); // Print space for inner positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        // Call the method to print a hollow rectangle with 4 rows and 5 columns
        hollow_rect(4, 5);
    }
}
