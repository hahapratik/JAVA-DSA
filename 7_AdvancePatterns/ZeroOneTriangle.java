/**
 * ZeroOneTriangle
 * 
 * This program generates a pattern of a triangle consisting of 0s and 1s.
 * The pattern alternates between 0 and 1 based on the sum of the row and column indices.
 * 
 * Example for n = 5:
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 * 
 * Steps:
 * 1. The method `zeroOneTriangle` takes an integer `n` as input, which represents the number of rows in the triangle.
 * 2. A nested loop is used to iterate through rows and columns to generate the pattern.
 * 3. The condition `(i + j) % 2 == 0` determines whether to print "1" or "0".
 * 4. The `main` method calls the `zeroOneTriangle` method with a sample input of 5.
 */
public class ZeroOneTriangle {
    public static void zeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        zeroOneTriangle(5);
    }
}
