import java.util.Scanner;

public class Function_sum {
    public static int calculateAdd(int a , int b){
    int result = a+b;
    System.out.println("result = " + result);
     return result;
    }
    public static void calculatesub(int a , int b){
    int result = a-b;
    System.out.println("result = " + result);
    }
    public static void calculateMul(int a , int b){
    int result = a*b;
    System.out.println("result = " + result);
    }
    public static void calculateDivide(int a , int b){
    int result = a/b;
    System.out.println("result = " + result);
    }
    
  public static void main(String [] args){
    calculateAdd(12, 2);
//    calculateMul(4, 2);
}
}