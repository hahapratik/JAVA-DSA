
// import java.util.Scanner; // Import the Scanner class for user input


// public class Q6 {
//     public static void main(String[] args) {
//         double temp = 100.0; // Initialize temperature variable with a default value
//         Scanner sc = new Scanner(System.in); // Create a Scanner object for input
//         System.out.print("Enter your Temp : "); // Prompt user to enter temperature
//         temp = sc.nextDouble(); // Read user input and store it in temp variable
//         System.out.println("Your entered temperature is: " + temp); // Display the entered temperature
//         sc.close(); // Close the Scanner object
//     }
// }

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp ;
        System.out.println("Enter oyur temperature = ");
        temp = sc.nextDouble();
        if (temp>100) {
            System.out.println("You have high temp");
        }else{System.out.println("You have a low temp");}
    }
}