import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        {
            // Prompt the user to enter their age
            System.out.print("Enter your age : ");
            age = sc.nextInt();

            // Check if the user is an adult
            if (age >= 18) {
                System.out.println("Adult");
            }

            // Check if the user is a teenager
            if (age >= 13 && age <= 18) {
                System.out.println("Teenager");
            }

            // If the user is neither an adult nor a teenager, they are a child
            else {
                System.out.println("Child");
            }

            // Close the scanner to prevent resource leaks
            sc.close();
        }
    }
}
