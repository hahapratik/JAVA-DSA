import java.util.Scanner;

public class Q4Calcilator {

    // In this code we are gonna make a simple calculator that will perform some
    // basics calculation
    public static void main(String[] args) {
        int a, b;
        char c;
        Scanner sc = new Scanner(System.in);
        {
            // Read two integers from the user
            System.out.print("Enter the value of a :");
            a = sc.nextInt();
            System.out.print("Enter the value of b :");
            b = sc.nextInt();
            // Read the operator character from the user
            System.out.print("Enter the operation you want to perform (+, - , *, %, / ) ");
            c = sc.next().charAt(0);
        }
        // Perform the operation based on the operator
        switch (c) {
            case '+':
                // Addition
                System.out.println("Result :" +(a + b));
                break;
            case '-':
                // Subtraction
                System.out.println("Result :" +(a - b));
                break;
            case '*':
                // Multiplication
                System.out.println("Result :" +(a * b));
                break;
            case '/':
                // Division
                System.out.println("Result :" +(a / b));
                break;
            case '%':
                // Modulus
                System.out.println("Result :" +(a % b));
                break;
            default:
                // Invalid operator
                System.out.println("Invalid OPERATOR");
                break;
        }
        // Close the scanner
        sc.close();
    }
}
