import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter thr value of a : "); // Prompt user to enter value of a
        float a = sc.nextInt(); // Read integer input and store in float variable 'a'

        System.out.print("Enter thr value of b : "); // Prompt user to enter value of b
        float b = sc.nextInt(); // Read integer input and store in float variable 'b'

        System.out.print("Enter thr value of c : "); // Prompt user to enter value of c
        float c = sc.nextInt(); // Read integer input and store in float variable 'c'

        float Average = (a + b + c) / 3; // Calculate the average of a, b, and c

        System.out.println(" Average is " + Average); // Display the calculated average

        sc.close(); // Close the Scanner to free resources
    }
}