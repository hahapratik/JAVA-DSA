public class q3 {
    // REVERSE NUMBER
    public static void Rev(int n){
        int mynum = n;
        int reverse = 0;
        while(n>0){
            int lastdigit = n%10;
            reverse = (reverse * 10) + lastdigit ;
            n = n/10;
        }
        System.out.println("Reverse of " +mynum + " = " + reverse);

    }

    public static void main(String[] args) {
        Rev(1234);
    }
}
