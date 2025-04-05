
import java.util.Scanner;

public class Q1 {
    
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a = sc.nextInt();
        System.out.println("Enter the second number : ");
        b = sc.nextInt();
        System.out.println("Enter the third number : ");
        c = sc.nextInt();
        int avg;
        avg = (a + b + c) / 3;
        System.out.println("The average of thic given Numbers is = " + avg);
        sc.close();
    }
}
