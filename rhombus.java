/**
 * Rhombus Pattern
 * 
 * This program creates a rhombus (parallelogram) pattern using asterisks (*).
 * Each row has the same number of stars but with increasing leading spaces.
 * 
 * Output Example (5 rows):
 *     *****
 *    *****
 *   *****
 *  *****
 * *****
 * 
 * @author Mr-BlackHat-lab
 */
public class rhombus {
    public static void main(String[] args) {
        // Define the size of the rhombus
        int size = 5;
        
        // Outer loop: controls the number of rows
        for (int i = 1; i <= size; i++) {
            // Inner loop: prints leading spaces for rhombus shape
            // Number of spaces decreases with each row
            for (int j = size; j >= i; j--) {
                System.out.print(" ");  // Print space for alignment
            }
            
            // Inner loop: prints stars (same number in each row)
            for (int k = 1; k <= size; k++) {
                System.out.print("*");  // Print star without space
            }
            
            System.out.println();  // Move to next line after completing a row
        }
    }
}
