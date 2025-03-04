import java.util.Scanner;

public class AreaOfCircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    {
      System.out.print("Enter the radius of Circle : ");
      float rad = sc.nextFloat();
      // have to write f after the number couse java will think every decimal number as double 
      float area = 3.14f * rad * rad;
      System.out.print("The Area of Circle is: ");
      System.out.println(area);
      sc.close();
    }

  }
}
