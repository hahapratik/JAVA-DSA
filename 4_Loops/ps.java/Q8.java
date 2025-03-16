import java.util.Scanner;
// Importing the Scanner class for taking input

public class Q8 {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Declaring variables
        int number, choice, evenSum = 0, oddSum = 0;
        
        // Using a do-while loop to repeatedly take input until the user decides to stop
        do {
            // Prompting the user to enter a number
            System.out.print("Enter the number : ");
            number = sc.nextInt();

            // Checking if the number is even or odd and updating the respective sum
            if (number % 2 == 0) {
                evenSum += number; // Adding to evenSum if the number is even
            } else {
                oddSum += number; // Adding to oddSum if the number is odd
            }
            
            // Asking the user if they want to continue
            System.out.println("Do you want to continue ? Press 1 for YES or 0 for NO");
            choice = sc.nextInt();
        } while (choice == 1); // Continue the loop if the user enters 1
        
        // Printing the sum of odd numbers
        System.out.println("Sum of odd Number : " + oddSum);
        
        // Printing the sum of even numbers
        System.out.println("Sum of Even Number : " + evenSum);
    }
}