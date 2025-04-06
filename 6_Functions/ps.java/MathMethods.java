import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args) {
        double a , b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        a = sc.nextDouble();
        System.out.print("Enter the Second number : ");
        b = sc.nextDouble();
        System.out.println("The Minimum of  These two numbers is : " + Math.min(a, b));
        System.out.println("The Maximum of  These two numbers is : " + Math.max(a, b));
        System.out.println("The Square Root of A is : " + Math.sqrt(a));
        System.out.println("Power : " + Math.pow(a,b));
        System.out.println("Absolute of these numbers : " + Math.abs(a));
        sc.close();
    }
}
