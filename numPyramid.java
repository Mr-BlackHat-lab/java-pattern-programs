/**
 * Number Pyramid Pattern
 * 
 * This program creates a right-angled triangle pattern using consecutive numbers.
 * Each row contains numbers from 1 to the current row number.
 * 
 * Output Example (5 rows):
 * 1 
 * 1 2 
 * 1 2 3 
 * 1 2 3 4 
 * 1 2 3 4 5 
 * 
 * @author Mr-BlackHat-lab
 */
public class numPyramid {
    public static void main(String[] args) {
        // Define the number of rows for the pyramid
        int rows = 5;
        
        // Outer loop: controls the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop: prints numbers from 1 to current row number
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");  // Print number followed by space
            }
            System.out.println();  // Move to next line after completing a row
        }
    }
}
