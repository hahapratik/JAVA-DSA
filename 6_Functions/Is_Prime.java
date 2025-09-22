public class Is_Prime {
    // public static boolean isPRime(int n) {
    // if(n==2){
    // return true;
    // }
    // boolean isPRime = true;
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // isPRime = false;
    // }
    // }
    // return isPRime;
    // }
    
    // optimied way
    // public static boolean isPRime(int n) {
    //     if (n == 2) {
    //         return true;
    //     }
    //     for (int i = 2; i <= Math.sqrt(n); i++) {
    //         boolean isPRime = false;
    //     }
    //     return true;
    // }
    // more optamized
    public static boolean isPRime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
           if(n%i==0){
             return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPRime(6));
    }
}