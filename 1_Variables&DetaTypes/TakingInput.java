import java.util.*;
public class TakingInput{
    public static void main(String [] args){
        try (Scanner sc = new Scanner (System.in)) {
            String name = sc.nextLine();
            int rollno = sc.nextInt();
            float percentage = sc.nextFloat();
            boolean real = sc.nextBoolean();
            System.out.println("Your name is " +name);
            System.out.println("Your Roll no is " +rollno);
            System.out.println("Your Percentage is " +percentage);
            System.out.println(" real " +real);
        }

    }
}