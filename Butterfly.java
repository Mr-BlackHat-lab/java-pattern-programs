/**
 * Butterfly Pattern
 * 
 * This program creates a symmetric butterfly wing pattern using asterisks (*).
 * The pattern consists of two triangular wings with spaces in the middle.
 * 
 * Output Example (5 rows):
 * *         * 
 * * *     * * 
 * * * * * * * 
 * * *     * * 
 * *         * 
 * 
 * @author Mr-BlackHat-lab
 */
public class Butterfly {
    public static void main(String[] args) {
        // Define the size of the butterfly pattern
        int size = 5;
        
        // Upper half of the butterfly (including middle)
        for (int i = 1; i <= size; i++) {
            // Left wing: print stars for current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  // Star followed by space
            }
            
            // Middle section: print spaces between wings
            // Number of spaces = 2 * (size - current row)
            int spaces = 2 * (size - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print("  ");  // Two spaces for proper alignment
            }
            
            // Right wing: print stars for current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  // Star followed by space
            }
            
            System.out.println();  // Move to next line
        }
        
        // Lower half of the butterfly (excluding middle row)
        for (int i = size - 1; i >= 1; i--) {
            // Left wing: print stars for current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  // Star followed by space
            }
            
            // Middle section: print spaces between wings
            // Number of spaces = 2 * (size - current row)
            int spaces = 2 * (size - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print("  ");  // Two spaces for proper alignment
            }
            
            // Right wing: print stars for current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  // Star followed by space
            }
            
            System.out.println();  // Move to next line
        }
    }
}
