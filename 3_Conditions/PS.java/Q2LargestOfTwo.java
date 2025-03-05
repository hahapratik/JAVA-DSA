/**
 * This program determines the larger of two integers input by the user.
 * It prompts the user to enter two integers, compares them, and prints
 * which one is larger.
 * 
 * Usage:
 * - The user will be prompted to enter the values of A and B.
 * - The program will then compare the two values.
 * - It will print "A is Bigger than B" if A is greater than B.
 * - It will print "B is Bigger than A" if B is greater than or equal to A.
 * 
 * Note:
 * - Ensure to enter valid integer values when prompted.
 * - The program uses a Scanner object to read input from the console.
 * - The Scanner object is closed after use to prevent resource leaks.
 */
import java.util.Scanner;

public class Q2LargestOfTwo {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the value of A
        System.out.print("Enter the value of A : ");
        a = sc.nextInt();
        
        // Prompt the user to enter the value of B
        System.out.print("Enter the value of B : ");
        b = sc.nextInt();
        
        // Compare the two values and print which one is larger
        if (a > b) {
            System.out.println("A is Bigger than B");
        } else {
            System.out.println("B is Bigger than A");
        }
        
        // Close the scanner to prevent resource leaks
        sc.close();
    }
}

