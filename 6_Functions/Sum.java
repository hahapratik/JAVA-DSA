import java.util.Scanner;

// Import the Scanner class for user input

public class Sum {
    // Method to add two integers
    public static void add(){
        int x, y; // Declare two integer variables
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        {
            // Prompt the user to enter the first integer
            System.out.print("Enter the first integer : ");
            x = sc.nextInt(); // Read the first integer from user input
            // Prompt the user to enter the second integer
            System.out.print("Enter the Second integer : ");
            y = sc.nextInt(); // Read the second integer from user input
            
            // Calculate the sum of the two integers and display the result
            System.out.println("The sum of First and Second is = " + (x + y));
            sc.close(); // Close the Scanner object to free up resources
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        add(); // Call the add method to perform the addition
    }
}