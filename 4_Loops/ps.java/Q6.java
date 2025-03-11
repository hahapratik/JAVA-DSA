import java.util.Scanner;
// Importing the Scanner class for taking input from the user
public class Q6 {
    public static void main(String[] args) {
        int n; // Variable to store the user input number
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to take input from the user
        do {
            System.out.print("Enter your number : "); // Prompting the user to enter a number
            n = sc.nextInt(); // Reading the user input and storing it in variable 'n'
            if (n % 10 == 0) { // Checking if the number is divisible by 10
                continue; // If the number is divisible by 10, skip the rest of the loop and start a new iteration
            }
            System.out.println("Number was : " + n); // Printing the number if it is not divisible by 10
            sc.close(); // Closing the Scanner object
        } while (true); // Infinite loop to keep asking for user input
    }
}
