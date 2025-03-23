/**
 * ======================================================================
 * Q3: Loop-Based Pattern Printing
 * ======================================================================
 * 
 * This class demonstrates printing a fixed pattern of stars using a loop.
 * 
 * Steps explained in the code:
 * 
 * 1. Main Method Declaration:
 *    - Defines the entry point of the program.
 * 
 * 2. Initialization of 'stars' Variable:
 *    - Initializes the counter 'stars' to 1, which controls the loop iterations.
 * 
 * 3. Loop Execution (do-while Loop):
 *    - Enters the do-while loop, ensuring that the code block is executed at least once.
 *    - Prints a predefined string pattern "* * * *" during each iteration.
 *    - Increments 'stars' after each print operation.
 *    - Continues looping until 'stars' exceeds the value of 4.
 * 
 * Additional Comments:
 *    - The code contains commented-out sections displaying alternative loop methods (for loop and while loop),
 *      illustrating different approaches to achieve the same output.
 */

public class Q3 {
    public static void main(String[] args) {
        // int stars = 1;

        for (int stars = 1; stars <= 4; stars++) {
            System.out.println("* * * *");
        
        // // while (stars<=4) {
        // //     System.out.println("* * * *");
        // //     stars++;
        // // }

        // do {
        //     System.out.println("* * * *");
        //     stars++;
        // } while (stars <= 4);
    }
}
}



