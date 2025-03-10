import java.util.Scanner;

/**
 * *******************************
 * TillMultipleOf10 - Detailed Documentation
 * *******************************
 *
 * This class demonstrates the following steps:
 *
 * 1. Scanner Initialization:
 *    - A Scanner object (sc) is created to capture user input from the console.
 *
 * 2. Do-While Loop:
 *    - The program enters a do-while loop, ensuring that the code within the loop
 *      executes at least once.
 *
 * 3. User Prompt and Input:
 *    - The user is presented with the prompt "Enter your number:".
 *    - The entered integer (n) is read using the Scanner's nextInt() method.
 *
 * 4. Condition Check:
 *    - The program checks if the entered number (n) is a multiple of 10 using
 *      the condition (n % 10 == 0).
 *
 * 5. Loop Termination:
 *    - If the condition is true (the number is a multiple of 10), the loop is terminated
 *      using the break statement.
 *
 * 6. Output:
 *    - If the number is not a multiple of 10, the number is printed to the console.
 *
 * The code effectively demonstrates how to use a do-while loop for repeatedly processing
 * user input until a specified condition (encountering a multiple of 10) is met.
 */
public class TillMultipleOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your number :");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
        sc.close();
    }
}
