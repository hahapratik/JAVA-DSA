import java.util.Scanner;

public class Q3LargestOfThree {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the value of A : ");
        a = sc.nextInt();
        System.out.print("Enter the value of B : ");
        b = sc.nextInt();
        System.out.print("Enter the value of C : ");
        c = sc.nextInt();

        // Comparing the three numbers to find the largest
        // If 'a' is greater than both 'b' and 'c', then 'a' is the largest
        if (a > b && a > c) {
            System.out.println("A is the Greatest");
        } 
        // If 'b' is greater than both 'a' and 'c', then 'b' is the largest
        else if (b > a && b > c) {
            System.out.println("B is the Greatest");
        }
        // If neither 'a' nor 'b' is the largest, then 'c' must be the largest
        else {
            System.out.println("C is the Greatest");
        }

        // Closing the scanner object to prevent resource leak
        sc.close();
    }
}