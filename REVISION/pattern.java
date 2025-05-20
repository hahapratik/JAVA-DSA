package REVISION;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int a = sc.nextInt();
        // // System.out.print("Enter the Second number : ");
        // // int b = sc.nextInt();
        // // System.out.print("Enter the Third number : ");
        // // int c = sc.nextInt();
        // if (a < 0) {
        // System.out.println("NEGETIVE");
        // }
        // else if (a == 0) {
        // System.out.println("The number is Zero");
        // } else {
        // System.out.println("POSITIVE");
        // }
        // double temp = 103.5;
        // System.out.println("Enter your temp");
        // double tempt = sc.nextDouble();

        // if (tempt > 100) {
        // System.out.println("You have fever");
        // }else{
        // System.out.println("you don't have fever");
        // }

        // System.out.print("Enter the year :");
        // int year = sc.nextInt();
        // if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
        // System.out.println("The given year is leap : " + year);
        // } else {
        // System.out.println("Not a Leap year " + year);
        // }
        int sum = 0;
        System.out.println("Enter the number : ");
        ;
        int a = sc.nextInt();
        if (a % 2 == 0) {
            for (int i = 0; i <= a; i++) {
                sum = sum + i;
            }
            System.out.println("Sum of Even number is :" + sum);
        } else {
            if (a % 2 != 0) {
                for (int i = 0; i <= a; i++) {
                    sum = sum + i;
                }
                System.out.println("Sum of Odd number is :" + sum);
            }
        }
        sc.close();
    }

}
