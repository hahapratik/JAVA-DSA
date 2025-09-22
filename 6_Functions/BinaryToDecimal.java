public class BinaryToDecimal {
    public static void btd(int n) {
        int mynum = n;
        int pow = 0; 
        int decNum = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            decNum = decNum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println("Decimal of " + mynum + " = " + decNum);
    }

    public static void main(String[] args) {
        btd(101);
    }
}
