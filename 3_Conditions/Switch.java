import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        {
            // Prompt the user to enter a value for n
            System.out.print("Enter the value of n : ");
            n = sc.nextInt();
            sc.close(); // Close the scanner to prevent resource leaks
            
            // Switch statement to handle different values of n
            switch (n) {
                case 1:
                    System.out.println("SAMOSA"); // If n is 1, print "SAMOSA"
                    break;
                case 2:
                    System.out.println("RASGULLA"); // If n is 2, print "RASGULLA"
                    break;
                case 3:
                    System.out.println("MOMO"); // If n is 3, print "MOMO"
                    break;
                case 4:
                    System.out.println("FRIES"); // If n is 4, print "FRIES"
                    break;
                case 5:
                    System.out.println("KACHORI"); // If n is 5, print "KACHORI"
                    break;
                default:
                    System.out.println("AISA KUCH NHE BECHTE"); // If n is none of the above, print this message
                    break;
            }
        }
    }
}
