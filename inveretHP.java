/**
 * Inverted Half Pyramid Pattern
 * 
 * This program creates an inverted right-angled triangle pattern using asterisks (*).
 * Each row has a decreasing number of stars, starting from the maximum.
 * 
 * Output Example (4 rows):
 * ****
 * ***
 * **
 * *
 * 
 * @author Mr-BlackHat-lab
 */
public class inveretHP {
    public static void main(String[] args) {
        // Define the number of rows for the inverted pyramid
        int rows = 4;
        
        // Outer loop: controls the number of rows (starts from max and decreases)
        for (int i = rows; i >= 1; i--) {
            // Inner loop: prints stars equal to the current value of i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");  // Print star without space
            }
            System.out.println();  // Move to next line after completing a row
        }
    }
}
