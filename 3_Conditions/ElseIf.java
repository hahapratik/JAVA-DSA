import java.util.Scanner; // Import the Scanner class for user input

public class ElseIf {
    public static void main(String[] args) {

    // This program classifies a person based on their age.
    // It uses a series of if-else statements to determine if the person is an adult, teenager, or child.
    
    // The program performs the following steps:
    // 1. Prompts the user to enter their age.
    // 2. Reads the age input from the user.
    // 3. Checks if the age is 18 or older, and prints "Adult" if true.
    // 4. If the age is between 13 and 18 (inclusive), it prints "Teenager".
    // 5. If the age is less than 13, it prints "Child".
    
    // Note:
    // - The Scanner object is used to read user input from the console.
    // - The Scanner object is closed after use to free up resources.

        int age;
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Enter your age : ");
            age = sc.nextInt();

            // Prompt the user to enter their age
            System.out.print("Enter your age : ");
            age = sc.nextInt();
            if (age >= 18) {
                System.out.println("Adult");
            }

           else if (age >= 13 && age <= 18) {
                System.out.println("Teenager");
            }

            else {
                System.out.println("Child");
            }

            sc.close();
        }
    }
}
