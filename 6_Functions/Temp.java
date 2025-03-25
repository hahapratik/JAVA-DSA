public class Temp {
    public static void main(String[] args) {
        // Initialize variables a and b
        int a = 12;
        int b = 13;

        // Swap the values of a and b using a temporary variable
        int Temp = a; // Store the value of a in Temp
        a = b;       // Assign the value of b to a
        b = Temp;    // Assign the value of Temp (original value of a) to b

        // Print the swapped values
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}