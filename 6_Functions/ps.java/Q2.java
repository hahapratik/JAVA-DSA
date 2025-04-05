import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        n = sc.nextInt();
        sc.close();

        if (isEven(n)) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
