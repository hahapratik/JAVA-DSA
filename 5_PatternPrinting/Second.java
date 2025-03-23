/**
 * This class contains a main method that prints a pattern of asterisks.
 * The pattern printed is a right-angled triangle aligned to the left.
 * 
 * The pattern looks like this:
 *  * * * * *
 *  * * * *
 *  * * *
 *  * *
 *  *
 */
public class Second {
    public static void main(String[] args) {
        // Outer loop for each line of the pattern
        for (int line = 1; line <= 5; line++) {
            // Inner loop for printing asterisks in each line
            for (int j = 1; j <= 5 - line + 1; j++) {
                // Print an asterisk followed by a space
                System.out.print(" *");
            }
            // Move to the next line after printing all asterisks for the current line
            System.out.println();
        }
    }
}
