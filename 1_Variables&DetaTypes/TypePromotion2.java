public class TypePromotion2 {
    public static void main(String[] args) {
        // byte a = 12;
        // short b = 11;
        int c = 10;
        float d = 20.25f;
        long e = 25;
        double f = 30;
        byte a = 4;
        byte b = (byte) (a * 2);
        // If we do int it will show error couse int is nit the bigger one
    //  int ans = c+d+e+f;
     double ans = c+d+e+f;
     System.out.println(ans); 
     System.out.println(b); 
    }
}
