import java.util.Scanner;

public class ProdutOfTwoNo {
    public static void main(String args[]) {
        int a, b, product;
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Enter the value of a: ");
            a = sc.nextInt();
            System.out.print("Enter the value of b: ");
            b = sc.nextInt();
            product = a * b;
            System.out.print("Product of a and b: ");
            System.out.println(product);
            sc.close();
        }
    }
}
