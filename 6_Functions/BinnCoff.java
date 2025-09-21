public class BinnCoff {
      public static int Fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f* i;
        }
        return f;
    }
    public static int BC(int a, int b){
        int a_fact = Fact(a);
        int b_fact = Fact(b);
        int aMb_fact = Fact(a-b);
        int binCof = a_fact/ (b_fact*aMb_fact);
        return binCof;
    }
    public static void main(String[] args) {
       System.out.println( BC(5, 4));;
    }
}
