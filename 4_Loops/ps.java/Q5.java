public class Q5 {
    public static void main(String[] args) {
        // reverse the given number
        int n = 223321;
        int rev = 0;
        while (n>0) {
           int lastdigit = n%10;
           rev = (rev *  10 ) + lastdigit;
            n/=10;
        }
        System.out.println(rev);
    }
}

