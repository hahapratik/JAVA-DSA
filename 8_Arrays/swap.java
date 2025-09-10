public class swap {
    public static void main(String[] args) {
        int a = 50;
        int b = 25;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without third variable
        a = a + b; 
        b = a - b;
        a = a - b; 

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
