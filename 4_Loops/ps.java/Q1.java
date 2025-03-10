
import java.util.Scanner;
/*
 * Q1: Print Integers from n to m
 * 
 * This program reads two integers from the user. It then uses a while
 * loop to print all integers starting from n and incrementing until m.
 */
// Read an integer from the console and assign it to n
// This is the main class
public class Q1 {
    // This is the main method, the entry point of the program
    public static void main(String[] args) {
        // Initialize a variable n to 1
        int n, m;
        Scanner sc = new Scanner(System.in);
        {
            // Create a Scanner object to read input from the console
            System.out.print("Enter the value of n : ");
            n = sc.nextInt();
            // Read an integer from the console and assign it to n
            System.out.print("Enter the value of m : ");
            // Read an integer from the console and assign it to m
            m = sc.nextInt();
        }
        // Start a while loop that continues as long as n is less than or equal to 10
        while (m >= n) {
            // Print the current value of n to the console
            System.out.println(+n);
            // Increment n by 1 in each iteration
            n++;
        } // close the scanner
        sc.close();
        // the program is end here
    }
}