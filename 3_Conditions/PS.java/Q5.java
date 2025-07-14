import java.util.Scanner;

public class Q5 {
    /**
     * This is the main method which serves as the entry point for the program.
     * It reads an integer input from the user and determines if the number is
     * positive or negative.
     *
     * Steps:
     * 1. Declare an integer variable 'n' to store the user input.
     * 2. Create a Scanner object 'sc' to read input from the console.
     * 3. Prompt the user to enter a number.
     * 4. Read the integer input from the user and store it in 'n'.
     * 5. Close the Scanner object to prevent resource leaks.
     * 6. Check if the number 'n' is negative:
     * - If 'n' is less than 0, print "The number is Negative".
     * - Otherwise, print "The number is Positive".
     *
     * Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Enter thr number you to find if  Positive or Negitive : ");
            n = sc.nextInt();
            sc.close();
            // Check if the number is negative
            if (n < 0) {
                System.out.println("The number is Negative");
            } else if (n == 0) {
                System.out.println("The number is Zero");
            } else {
                // If the number is not negative, it is positive
                System.out.println("The number is Positive");
            }

        }
    }
}

// import java.util.Scanner;

// public class Q1 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number = ");
//         int a = sc.nextInt();
//         if (a < 0) {
//             System.out.println("This number is Negitive");
//         } else if (a == 0) {
//             System.out.println("The number is Zero");
//         } else {
//             System.out.println("The number is Positive");
//         }

//     }
// }