import java.util.Scanner;
// Define the class Q1
public class Q1 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

     System.out.println("Enter the value of a = ");
     int a = sc.nextInt();
     System.out.println("Enter the value of b = ");
     int b = sc.nextInt();
     System.out.println("Enter the value of c = ");
     int c = sc.nextInt();
     int avg = (a+b+c)/3;
     System.out.println("Average is = " +avg);
    }
}