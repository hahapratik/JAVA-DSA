
import java.util.Scanner;
// Importing the Scanner class for taking user input

public class Q1 {
    
    public static void main(String[] args) {
        int a, b, c; // Declaring three integer variables to store user input
        
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter the first number
        System.out.println("Enter the first number : ");
        a = sc.nextInt(); // Reading the first number
        
        // Prompting the user to enter the second number
        System.out.println("Enter the second number : ");
        b = sc.nextInt(); // Reading the second number
        
        // Prompting the user to enter the third number
        System.out.println("Enter the third number : ");
        c = sc.nextInt(); // Reading the third number
        
        int avg; // Declaring a variable to store the average
        
        // Calculating the average of the three numbers
        avg = (a + b + c) / 3;
        
        // Printing the calculated average to the console
        System.out.println("The average of thic given Numbers is = " + avg);
        
        // Closing the Scanner object to release resources
        sc.close();
    }
    
}