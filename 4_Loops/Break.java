// Heading: Explanation of the Break.java Program
// This program demonstrates how the break statement works within a for-loop.

public class Break {
    public static void main(String[] args) {
        // For-loop starts: initializes i = 1, will iterate while i <= 10, and increments i by 1 after each iteration.
        for (int i = 1; i <= 10; i++) {
            // If statement: when i equals 3...
            if (i == 3) {
                // Break statement: terminates the loop immediately when the condition is met.
                break;
            }
            // Print the current value of i: for iterations where i is not 3.
            System.out.println(i);
        }
        // After the loop, print a message indicating the loop has ended.
        System.out.println("Im out of the loop");
    }
}
