public class Q5 {

    public static void main(String[] args) {
        // Initialize variables x and y
        int x = 10, y = 5;

        // Calculate the first expression
        // exp1 = y * (x / y + x / y)
        // exp1 = 5 * (10 / 5 + 10 / 5)
        // exp1 = 5 * (2 + 2)
        // exp1 = 5 * 4
        // exp1 = 20
        int exp1 = (y * (x / y + x / y));

        // Calculate the second expression
        // exp2 = y * x / y + y * x / y
        // exp2 = 5 * 10 / 5 + 5 * 10 / 5
        // exp2 = 50 / 5 + 50 / 5
        // exp2 = 10 + 10
        // exp2 = 20
        int exp2 = (y * x / y + y * x / y);
        
        // Print the results of the expressions
        System.out.println(exp1); // Output: 20
        System.out.println(exp2); // Output: 20
    }
}