import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Enter your age : ");
            age = sc.nextInt();

            if (age >= 18) {
                System.out.println("Adult");
            }

            if (age >= 13 && age <= 18) {
                System.out.println("Teenager");
            }

            else {
                System.out.println("Child");
            }

            sc.close();
        }
    }
}
