/**
 * Number Pyramid Pattern
 * 
 * This program creates a centered pyramid pattern using numbers.
 * Each row contains the row number repeated multiple times.
 * 
 * Output Example (5 rows):
 *     1
 *    2 2
 *   3 3 3
 *  4 4 4 4
 * 5 5 5 5 5
 * 
 * @author Mr-BlackHat-lab
 */
public class pyramid {
    public static void main(String[] args) {
        // Define the number of rows for the pyramid
        int rows = 5;
        
        // Outer loop: controls the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop: prints leading spaces for centering
            // Number of spaces = (total rows - current row)
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(" ");  // Print space for alignment
            }
            
            // Inner loop: prints the row number with spaces
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");  // Print row number followed by space
            }
            
            System.out.println();  // Move to next line after completing a row
        }
    }
}
