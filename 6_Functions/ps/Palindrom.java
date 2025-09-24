package ps;

public class Palindrom {
      public static void Rev(int n){
        int mynum = n;
        int reverse = 0;
        while(n!=0){
            
            int lastdigit = n%10;
            reverse = (reverse * 10) + lastdigit ;
            n = n/10;
        }
        if(mynum == reverse){
            System.out.println(reverse +" is a Polindrom");
        }else{
            System.out.println(reverse +" is not a Polindrom");
        }
        System.out.println("Reverse of " +mynum + " = " + reverse);

    }

    public static void main(String[] args) {
        Rev(95434597);
    }
}


