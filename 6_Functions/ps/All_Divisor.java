package ps;

public class All_Divisor {
    public static void aD(int n){
        for(int i=1 ; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        aD(23);
    }
}
