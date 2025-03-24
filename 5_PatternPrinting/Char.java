/**
 * The Char class prints a pattern of characters starting from 'A'.
 * The pattern consists of 4 lines, with each line containing an increasing number of characters.
 * 
 * Example output:
 * A 
 * B C 
 * D E F 
 * G H I J 
 */
public class Char {
    public static void main(String[] args) {
        char ch = 'A'; // Initialize the starting character to 'A'
        
        // Outer loop to handle the number of lines
        for (int lines = 1; lines <= 4; lines++) {
            // Inner loop to handle the number of characters per line
            for (int chars = 1; chars <= lines; chars++) {
                System.out.print(ch + " "); // Print the current character followed by a space
                ch++; // Move to the next character in the sequence
            }
            System.out.println(); // Move to the next line after printing all characters in the current line
        }
    }
}
