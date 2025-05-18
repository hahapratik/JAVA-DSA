import java.util.Scanner;

public class Q2 {
    // Question 2: In a program, input the side of a square. You have to output the area of the square.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Enter the side of a SQUARE : "); // Prompt the user to enter the side of the square

        int side = sc.nextInt(); // Read the integer input for the side of the square

        int area = side * side; // Calculate the area of the square (side * side)

        System.out.println("The area of Square with given side is " + area); // Output the calculated area to the user
        sc.close();
    }
    
}