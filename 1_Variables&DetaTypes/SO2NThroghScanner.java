import java.util.Scanner;

public class SO2NThroghScanner {
    public static void main(String atgs[]) {
        // take integer first
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a = sc.nextInt();
        System.out.print("Enter the value of b:");
        b = sc.nextInt();
        // creating the value of sum
        int sum = a + b;
        System.out.print("sum of a and b: ");
        System.out.println(sum);
        // close the scanner to get rid of the yellow line
        sc.close();
    }
}