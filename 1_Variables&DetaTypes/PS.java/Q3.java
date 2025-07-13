import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Question 3: Enter cost of 3 items from the user (using float data type) - a
        // pencil, a pen and an eraser. You have to output the total cost of the items
        // // back to the user as their bill.
        // float pencil, pen, eraser, total;
        // Scanner sc = new Scanner(System.in);
        // {
        //     System.out.print("Enter the amount of Pencil : ");
        //     pencil = sc.nextFloat();

        //     System.out.print("Enter the amount of pen : ");
        //     pen = sc.nextFloat();

        //     System.out.print("Enter the amount of eraser : ");
        //     eraser = sc.nextFloat();

        //     total = pen + pencil + eraser;

        //     System.out.println("The total amount of the Pencil , Pen and Eraser is : " + total);
        //     // Now add 18% tax in it
        //     float tax = total + (0.18f * total);
        //     System.out.println("Total with 18% tax is : "+tax);
        //     sc.close();
        // }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of PENCIL :");
        float a = sc.nextFloat();
        System.out.print("Enter the price of ERASER :");
        float b = sc.nextFloat();
        System.out.print("Enter the price of BOX :");
        float c = sc.nextFloat();
        Float total = (a+b+c);
        System.out.println("Total price is : "+total);
        float tax = ((a+b+c)*18)/100;
        System.out.println("Price after 18%tax : "+(total+tax) );
        sc.close();

    }
}
