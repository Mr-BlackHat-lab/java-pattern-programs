/**
 * Half Pyramid Pattern
 * 
 * This program creates a right-angled triangle pattern using asterisks (*).
 * Each row has an increasing number of stars.
 * 
 * Output Example (4 rows):
 * *
 * **
 * ***
 * ****
 * 
 * @author Mr-BlackHat-lab
 */
public class HalfPyramid {
    public static void main(String[] args) {
        // Define the number of rows for the pyramid
        int rows = 4;
        
        // Outer loop: controls the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop: prints stars equal to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");  // Print star without space
            }
            System.out.println();  // Move to next line after completing a row
        }
    }
}
