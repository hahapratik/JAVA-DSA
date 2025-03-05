import java.util.Scanner;

public class Ternery {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        {
            // Prompt the user to enter the value of n
            System.out.print("Enter the the value of n :");
            // Read the integer input from the user
            n = sc.nextInt();
            // Close the scanner to prevent resource leaks
            sc.close();
        }
        // Use ternary operator to determine if n is a passing grade
        String pass = (n >= 33) ? "Pass" : "Fail";
        // Print the result
        System.out.println(pass);
    }
}