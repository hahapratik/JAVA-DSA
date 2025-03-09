import java.util.Scanner;

// This program checks whether a given year is a leap year or not
public class Q9 {
    public static void main(String[] args) {
        // Variable to store the year input
        int year;
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        {
            // Prompt user to enter a year
            System.out.print("Enter the year you want to see if its leap year or not : ");
            // Read the year from user
            year = sc.nextInt();
            // Close the scanner to prevent resource leak
            sc.close();

            // Check if it's a leap year using the following rules:
            // 1. Year must be divisible by 4
            // 2. If year is divisible by 100, it must also be divisible by 400
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " Is a leap year");
            } else {
                System.out.println(year + " Is not aleap year");
            }
        }
    }
}
