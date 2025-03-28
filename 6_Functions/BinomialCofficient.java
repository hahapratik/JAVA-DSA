public class BinomialCofficient {
public static int fact(int n ){
    int f = 1;
    for(int i = 1; i<=n; i++){
        f*=i;
    }return f;
}    
public static int BinoCoff(int a, int b){
    int fact_a = fact(a);
    int fact_b = fact(b);
    int fact_aMb = fact(a-b);
    int bc = fact_a / (fact_b*fact_aMb);
    return bc;}

public static void main(String[] args) {
    System.out.println(BinoCoff(5, 2));
}
}