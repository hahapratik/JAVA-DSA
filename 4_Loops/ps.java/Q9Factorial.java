import java.util.Scanner; // Import the Scanner class for user input


public class Q9Factorial {
    public static void main(String[] args) {
        int n, fact = 1; // Initialize variables n and fact
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        {
            System.out.print("Enter the number : "); // Prompt the user to enter a number
            n = sc.nextInt(); // Read the integer input from the user

            for (int i = 1; i <= n; i++) { // Loop from 1 to n
                fact *= i; // Multiply fact by i in each iteration
            }
        }
        System.out.println("FACTORIAL : " + fact); 
        sc.close();// Print the factorial of the number
    }
}