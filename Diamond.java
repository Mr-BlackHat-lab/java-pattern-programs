/**
 * Diamond Pattern
 * 
 * This program creates a diamond shape pattern using asterisks (*).
 * The diamond consists of an upper pyramid and a lower inverted pyramid.
 * 
 * Output Example (3):
 *   *
 *  * *
 * * * *
 *  * *
 *   *
 * 
 * @author Mr-BlackHat-lab
 */
public class Diamond {
    public static void main(String[] args) {
        // Define the size of the diamond (half height)
        int size = 3;
        
        // Upper half of the diamond (including middle)
        for (int i = 1; i <= size; i++) {
            // Print leading spaces for centering
            for (int j = size; j > i; j--) {
                System.out.print(" ");  // Single space for proper alignment
            }
            
            // Print stars with spaces between them
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");  // Star followed by space
            }
            
            System.out.println();  // Move to next line
        }
        
        // Lower half of the diamond (excluding middle)
        for (int i = size - 1; i >= 1; i--) {
            // Print leading spaces for centering
            for (int j = size; j > i; j--) {
                System.out.print(" ");  // Single space for proper alignment
            }
            
            // Print stars with spaces between them
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");  // Star followed by space
            }
            
            System.out.println();  // Move to next line
        }
    }
}
