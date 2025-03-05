import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        int income; // Variable to store the user's income
        int tax; // Variable to store the calculated tax
        Scanner sc = new Scanner(System.in); // Scanner object to take input from the user
        {
            System.out.print("Enter your Annual Income : ");
            income = sc.nextInt(); // Read the user's income

            // Determine the tax based on the income
            if (income <= 500000) {
                tax = 0; // No tax for income less than or equal to 500,000
                System.out.println("You don't have to give TAX ");
            } 
            else if (income >= 500000 && income < 1000000) {
                tax = (int) (income * 0.2); // 20% tax for income between 500,000 and 1,000,000
                System.out.println("Your TAX is : " + tax);
            } 
            else {
                tax = (int) (income * 0.3); // 30% tax for income above 1,000,000
                System.out.println("Your TAX is : " + tax);
            }
            sc.close(); // Close the scanner object
        }
    }
}
