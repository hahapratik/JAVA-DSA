import java.util.Scanner;

/**
 * This program takes an integer input from the user representing a day of the
 * week
 * and prints the corresponding day name. If the input is not between 1 and 7,
 * it prints "INVALID DAY".
 * 
 * The days are mapped as follows:
 * 1 - MONDAY
 * 2 - TUESDAY
 * 3 - WEDNESDAY
 * 4 - THURSDAY
 * 5 - FRIDAY
 * 6 - SATURDAY
 * 7 - SUNDAY
 * 
 * Usage:
 * Run the program and enter a number between 1 and 7 to get the corresponding
 * day name.
 * Any other number will result in "INVALID DAY".
 */

// import java.util.Scanner;

// public class Q7 {
// public static void main(String[] args) {
// int days;
// Scanner sc = new Scanner(System.in);

// // Prompt the user to enter a day number
// System.out.print("Enter the day : ");
// days = sc.nextInt();

// // Determine the day of the week based on the input number
// switch (days) {
// case 1:
// System.out.println("MONDAY");
// break;

// case 2:
// System.out.println("TUESDAY");
// break;

// case 3: // Case for day 3
// System.out.println("WEDNESDAY");
// break;

// case 4: // Case for day 4
// System.out.println("THURSDAY");
// break;

// case 5: // Case for day 5
// System.out.println("FRIDAY");
// break;

// case 6:
// System.out.println("SATURDAY");
// break;

// case 7:
// System.out.println("SUNDAY");
// break;

// default:
// // Handle invalid input
// System.out.println("INVALID DAY");
// break;
// }sc.close();
// }
// }

public class Q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days;
        System.out.print("Enter the number of day : ");
        days = sc.nextInt();
        switch (days) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednusday");
                break;
            case 4:
                System.out.print("Thrusday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saterday");
                break;
            case 7:
                System.out.print("sunday");
                break;

            default:
                System.out.println("Unvalid");
                break;
        }
        sc.close();
    }
}