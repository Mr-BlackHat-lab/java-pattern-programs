/**
 * 0-1 Triangle Pattern
 * 
 * This program creates a triangle pattern that alternates between 0 and 1.
 * Each position's value depends on whether its position number is odd or even.
 * 
 * Output Example (5 rows):
 * 1 
 * 01 
 * 101 
 * 0101 
 * 10101 
 * 
 * @author Mr-BlackHat-lab
 */
public class Trinagle01 {
    public static void main(String[] args) {
        // Define the number of rows for the triangle
        int rows = 5;
        
        // Outer loop: controls the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop: prints alternating 0s and 1s based on position
            for (int j = i; j >= 1; j--) {
                // If position is even, print 0; if odd, print 1
                if (j % 2 == 0) {
                    System.out.print("0");  // Print 0 for even positions
                } else {
                    System.out.print("1");  // Print 1 for odd positions
                }
            }
            System.out.println();  // Move to next line after completing a row
        }
    }
}
