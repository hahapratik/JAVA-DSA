import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n; // Variable to store the number input by the user
        Scanner sc = new Scanner(System.in); // Scanner object to read input from the user
        {
            System.out.print("Enter the number: "); // Prompt the user to enter a number
            n = sc.nextInt(); // Read the number entered by the user
            if (n % 2 == 0) { // Check if the number is even
                System.out.println("EVEN"); // Print "EVEN" if the number is even
            } else { // If the number is not even, it is odd
                System.out.println("ODD"); // Print "ODD" if the number is odd
            }
            sc.close(); // Close the scanner object to free up resources
        }
    }
}
