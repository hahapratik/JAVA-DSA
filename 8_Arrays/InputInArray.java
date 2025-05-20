import java.util.Scanner;

public class InputInArray {
    public static void main(String[] args) {
        // Step 1: Declare an array to store marks for different subjects
        int Marks[] = new int[100]; // Array to hold marks, size 100 for flexibility

        // Step 2: Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in); // Scanner for reading user input

        // Step 3: Prompt the user to enter marks for English
        System.out.print("Enter English Marks :"); // Prompt for English marks
        Marks[0] = sc.nextInt(); // Store English marks in the first index of the array

        // Step 4: Prompt the user to enter marks for Maths
        System.out.print("Enter Maths Marks :"); // Prompt for Maths marks
        Marks[1] = sc.nextInt(); // Store Maths marks in the second index of the array

        // Step 5: Prompt the user to enter marks for Physics
        System.out.print("Enter Physics Marks :"); // Prompt for Physics marks
        Marks[2] = sc.nextInt(); // Store Physics marks in the third index of the array

        // Step 6: Display the entered marks for each subject
        System.out.println("English Marks = " + Marks[0]); // Print English marks
        System.out.println("Maths Marks = " + Marks[1]); // Print Maths marks
        System.out.println("Physics Marks = " + Marks[2]); // Print Physics marks

        // Step 7: Close the Scanner object to release resources
        sc.close(); 
        // Close the scanner to prevent resource leaks
        int percentage = (Marks[0]+Marks[1]+Marks[2])/3;// by this we can find the prcentage of the number      
           System.out.println("PERCENTAGE IS = "+percentage+"%");
        System.out.println("Lenght of Array is = "+Marks.length);// by this we can find the length of the array
    
        // int marks[] = new int[10];
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Phy number : ");
        //  marks[0]= sc.nextInt();
        // System.out.print("Enter Che number : ");
        // marks[1] = sc.nextInt();
        // System.out.print("Enter Bio number : ");
        // marks[2] = sc.nextInt();
        // System.out.println("Phy Marks = "+marks[0]);
        // System.out.println("Che Marks = "+marks[1]);
        // System.out.println("Bio Marks = "+marks[2]);
        // int percentage = (marks[0]+marks[1]+marks[2])/3;
        // System.out.println("Percentage is : " + percentage);
        // sc.close();
    }
}