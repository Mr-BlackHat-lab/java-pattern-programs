/**
 * Solid Rectangle Pattern
 * 
 * This program creates a solid rectangle pattern using asterisks (*).
 * The rectangle is filled completely with stars.
 * 
 * Output Example (4x5 rectangle):
 * *****
 * *****
 * *****
 * *****
 * 
 * @author Mr-BlackHat-lab
 */
public class solidrec {
    public static void main(String[] args) {
        // Define the dimensions of the rectangle
        int rows = 4;       // Number of rows (height)
        int columns = 5;    // Number of columns (width)
        
        // Outer loop: controls the number of rows
        for (int i = 0; i < rows; i++) {
            // Inner loop: controls the number of columns (stars per row)
            for (int j = 0; j < columns; j++) {
                System.out.print("*");  // Print star without newline
            }
            System.out.println();  // Move to next line after completing a row
        }
    }
}
