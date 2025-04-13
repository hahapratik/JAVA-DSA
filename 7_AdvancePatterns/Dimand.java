/**
 * The Dimand class contains a method to print a diamond pattern of stars.
 * The pattern is created using nested loops for the upper and lower halves of the diamond.
 */
public class Dimand {

    /**
     * Prints a diamond pattern of stars based on the given size.
     * 
     * @param n The number of rows for the upper half of the diamond. The total
     *          height of the diamond will be 2 * n - 1.
     */
    public static void dimand(int n) {
        // 1st half: Construct the upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces to align stars in the center
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print stars for the current row
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars for the current row
            System.out.println();
        }

        // 2nd half: Construct the lower half of the diamond
        for (int i = n; i >= 1; i--) {
            // Print spaces to align stars in the center
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print stars for the current row
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars for the current row
            System.out.println();
        }
    }

    /**
     * The main method serves as the entry point of the program.
     * It calls the dimand method to print a diamond pattern of size 5.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        dimand(5); // Call the dimand method with size 5 to print the diamond pattern
    }
}
