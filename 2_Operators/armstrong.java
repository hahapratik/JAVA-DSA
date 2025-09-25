public class armstrong {
    public static void armStrong(int n) {
        int sum = 0;
        int dup = n;
        while (n != 0) {
            int lastNum = n % 10;
            sum = sum + (lastNum * lastNum * lastNum);
            n = n / 10;
        }
        if (dup == sum) {
            System.out.println(dup + " is an Armstrong Number");
        } else {
            System.out.println(dup + " is not an Armstrong Number");
        }
    }

    public static void main(String[] args) {
        armStrong(371);
    }
}
