import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Enter the value of A : ");
            a = sc.nextInt();
            System.out.print("Enter the value of B : ");
            b = sc.nextInt();
            if (a > b) {
                System.out.println("A is Bigger then B ");
            } else {
                System.out.println("B is Bigger then A ");
            }
            sc.close();
        }
    }
}
