import java.util.Scanner;

public class Q3 {
    // PALINDROME
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Number : " + n + " is a Palindrome");
        } else {
            System.out.println("Number : " + n + " is not a Palindrome");
        }
    }

    public static boolean isPalindrome(int num){
        int Palindrome = num;
        int reverse = 0;

        while (Palindrome != 0) {
            int reminder = Palindrome % 10;
            reverse = reverse * 10 + reminder;
            Palindrome = Palindrome / 10;

            if ( num == reverse){
                return true;
            }
        }return false;
    }
}
