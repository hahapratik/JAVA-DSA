public class SolidRhombus {

    // Method to print a solid rhombus pattern
    public static void Solid_Rhombus(int n) {
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop to print spaces before the stars
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" "); // Print space
            }
            // Inner loop to print stars in each row
            for (int j = 1; j <= n; j++) {
                System.out.print("* "); // Print star followed by a space
            }
            
            System.out.println(); // Move to the next line after each row
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Solid_Rhombus(5); // Call the method with size 5 to print the rhombus
    }
}