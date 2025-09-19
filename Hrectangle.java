/**
 * Hollow Rectangle Pattern
 * 
 * This program creates a hollow rectangle pattern using asterisks (*).
 * Stars are printed only on the border (first/last row and first/last column).
 * The interior is filled with spaces.
 * 
 * Output Example (4x5 rectangle):
 * *****
 * *   *
 * *   *
 * *****
 * 
 * @author Mr-BlackHat-lab
 */
public class Hrectangle {
    public static void main(String[] args) {
        // Define the dimensions of the rectangle
        int rows = 4;       // Number of rows (height)
        int columns = 5;    // Number of columns (width)
        
        // Outer loop: controls the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop: controls the number of columns
            for (int j = 1; j <= columns; j++) {
                // Print star if it's on the border (first/last row or first/last column)
                if (i == 1 || j == 1 || i == rows || j == columns) {
                    System.out.print("*");
                } else {
                    // Print space for interior positions
                    System.out.print(" ");
                }
            }
            System.out.println();  // Move to next line after completing a row
        }
    }
}
