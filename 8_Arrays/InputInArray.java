import java.util.Scanner;

public class InputInArray {
    public static void main(String[] args) {
     int Marks[] = new int[100];
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter English Marks :");
     Marks[0] = sc.nextInt();
     System.out.print("Enter Maths Marks :");
     Marks[1] = sc.nextInt();
     System.out.print("Enter Physics Marks :");
     Marks[2] = sc.nextInt();
     System.out.println("English Marks = "+Marks[0]);
     System.out.println("Maths Marks = "+Marks[1]);
     System.out.println("Physics Marks = "+Marks[2]);
     sc.close();
        }
    }
