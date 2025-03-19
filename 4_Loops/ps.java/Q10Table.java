import java.util.Scanner; // Import the Scanner class from the java.util package

public class Q10Table {
    public static void main(String[] args) {
        int n; // Declare an integer variable 'n' to store the number for which the table will
               // be generated
        Scanner sc = new Scanner(System.in); // Create a Scanner object 'sc' to read input from the user

        {
            System.out.print("Enter the number you want table of: "); // Prompt the user to enter a number
            n = sc.nextInt(); // Read the number entered by the user and store it in the variable 'n'

            for (int i = 1; i <= 10; i++) {// Loop from 1 to 10 to generate the multiplication table
                // Print the multiplication table in the format "n * i = result"
                // 'n' is the number entered by the user
                // 'i' is the current number in the loop (from 1 to 10)
                // 'n * i' is the result of multiplying 'n' by 'i'
                System.out.println(n + " * " + i + " = " + n * i);
            }
        }sc.close();
        // now here closing the scanner
    }
}