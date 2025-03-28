// This is the main class where function overloading is demonstrated
public class FunctionOverloading2 {

    // This method calculates the sum of two integers
    public static int sum(int a, int b) {
        return a + b; // Returns the sum of two integer parameters
    }

    // This method calculates the sum of two floating-point numbers
    public static float sum(float a, float b) {
        return a + b; // Returns the sum of two float parameters
    }

    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Calls the integer version of the sum method and prints the result
        System.out.println(sum(7, 3)); // Output: 10

        // Calls the float version of the sum method and prints the result
        System.out.println(sum(3.4f, 6.6f)); // Output: 10.0
    }
}