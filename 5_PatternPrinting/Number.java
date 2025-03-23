/* 
Question:
Write a Java program to print the following pattern:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

*/

public class Number {
    // Main method to execute the program
    public static void main(String[] args) {
        // Outer loop for the number of rows
        for(int i = 1; i <= 5; i++) {
            // Inner loop for printing numbers in each row
            for(int j = 1; j <= i; j++) {
                // Print the current number followed by a space
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}