/**
 * This class demonstrates a simple pattern printing program in Java.
 * It prints a right-angled triangle pattern using asterisks (*).
 */
public class First {
    public static void main(String[] args) {
        // Loop through each line
        for (int line = 1; line <= 4; line++) {
            // Loop to print the required number of stars for the current line
            for (int star = 1; star <= line; star++) {
                System.out.print(" *"); // Print a star
            }
            System.out.println(); // Move to the next line after printing stars for the current line
        }
    }
}
