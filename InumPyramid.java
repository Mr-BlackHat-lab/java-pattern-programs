/**
 * Inverted Number Pyramid Pattern
 * 
 * This program creates an inverted right-angled triangle pattern using consecutive numbers.
 * Each row starts with numbers from 1 but has decreasing count of numbers.
 * 
 * Output Example (5 rows):
 * 1 2 3 4 5 
 * 1 2 3 4 
 * 1 2 3 
 * 1 2 
 * 1 
 * 
 * @author Mr-BlackHat-lab
 */
public class InumPyramid {
    public static void main(String[] args) {
        // Define the number of rows for the inverted pyramid
        int rows = 5;
        
        // Outer loop: controls the number of rows (starts from max and decreases)
        for (int i = rows; i >= 1; i--) {
            // Inner loop: prints numbers from 1 to current value of i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");  // Print number followed by space
            }
            System.out.println();  // Move to next line after completing a row
        }
    }
}
