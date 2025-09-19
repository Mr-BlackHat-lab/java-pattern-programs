/**
 * 180° Rotated Half Pyramid Pattern
 * 
 * This program creates a half pyramid pattern rotated 180 degrees.
 * It uses leading spaces to create the right-aligned triangle effect.
 * 
 * Output Example (4 rows):
 *    *
 *   **
 *  ***
 * ****
 * 
 * @author Mr-BlackHat-lab
 */
public class ifp180 {
    public static void main(String[] args) {
        // Define the number of rows for the pyramid
        int rows = 4;
        
        // Outer loop: controls the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop: prints leading spaces to right-align the stars
            // Number of spaces = (total rows - current row)
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");  // Print space for alignment
            }
            
            // Inner loop: prints stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");  // Print star without space
            }
            
            System.out.println();  // Move to next line after completing a row
        }
    }
}
