package ps;

//Write a Java method to compute the average of three numbers..
public class q1 {
    public static void avg(float a, float b, float c){
       float  sum = a+b+c;
       float average = sum/3;
       System.out.println("Average of the numbers is : " +average);
    }
    public static void main(String[] args) {
        avg(12, 3, 24);
    }
}
