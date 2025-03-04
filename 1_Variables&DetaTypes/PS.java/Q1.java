import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Question 1: In a program, input 3 numbers : A, B and C. You have to output the average
        // of these 3 numbers.
        float a, b, c, average;
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Enter the value of a : ");
            a = sc.nextFloat();
            System.out.print("Enter the value of b : ");
            b = sc.nextFloat();
            System.out.print("Enter the value of c : ");
            c = sc.nextFloat();
            
            // now apply the foemula of average
            average = (a + b + c) / 3;
            
            System.out.print("The Average of three numbers is : ");
            System.out.print(average);
            sc.close();
        }
    }
}
