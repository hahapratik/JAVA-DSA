import java.util.Scanner;

public class Q2 {
    //Question 2: In a program, input the side of a square You nave to output the area of the square.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System . in);{
            System.out.print("Enter the the value of the side of a Square : ");
            int side = sc.nextInt();
            int area = side * side ;
            System.out.print("The area of the Square is : ");
            System.out.print(area);
            sc.close();
        
        }
    }
}
