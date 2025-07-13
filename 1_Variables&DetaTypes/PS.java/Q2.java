import java.util.Scanner;

public class Q2 {
    // Question 2: In a program, input the side of a square. You have to output the
    // area of the square.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.println("Enter the sides of a Square = ");
        int sides = sc.nextInt();
        int area = sides * sides;
        System.out.println("Area = " + area);
        sc.close();
    }
}