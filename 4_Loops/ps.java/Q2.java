import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {

        int n, sum = 0, i = 1;
        Scanner sc = new Scanner(System.in);

// taking input from user
// sum variable to store the sum of numbers
// i is a counter
// creating scanner object
{
    System.out.print("Enter the number you want sum of : ");
    // taking input from user
    n = sc.nextInt();
    // while loop to iterate from 1 to n
    while (i <= n) {
    sum += i;
    i++;
    }
    // closing the scanner object
    sc.close();
    // printing the sum
    System.out.println("sum is " + sum);
}
    }
}