import java.util.Scanner;
// Define the class Q1
public class Q1 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt and read the price of the pen
        System.out.print("Enter the price of Pen = ");
        float a = sc.nextFloat();

        // Prompt and read the price of the pencil
        System.out.print("Enter the price of Pencil = ");
        float b = sc.nextFloat();

        // Prompt and read the price of the book
        System.out.print("Enter the price of book = ");
        float c = sc.nextFloat();

        // Calculate the total sum of all items
        float sum = a + b + c;
        System.out.println("The Total price is = " + sum);

        // Close the Scanner to free resources
        sc.close();

        // Calculate the average price of the items
        float average = (a + b + c) / 3;
        System.out.println("Average is = " + average);

        // Calculate GST (18% of the total sum)
        float gst = ((a + b + c) * 18) / 100;
        System.out.println("Total GST on the purches is = " + gst);

        // Print the total price including GST
        System.out.print("Total price including GST is = " + (gst + sum));
    }
}