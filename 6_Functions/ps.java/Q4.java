import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum is " + sumDigits(n));
        sc.close();
    };
    public static int sumDigits(int a){
        int sumOfDigits = 0;
        while (a>0) {
            int lastDigit = a%10;
            sumOfDigits += lastDigit;
            a/=10;
        }
        return sumOfDigits;
    }
}
