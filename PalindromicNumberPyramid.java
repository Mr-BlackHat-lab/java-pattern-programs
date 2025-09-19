/**
 * Palindromic Number Pyramid Pattern
 * 
 * This program creates a centered pyramid where each row forms a palindrome.
 * Numbers decrease from row number to 1, then increase back to row number.
 * 
 * Output Example (5 rows):
 *     1 
 *    212 
 *   32123 
 *  4321234 
 * 543212345 
 * 
 * @author Mr-BlackHat-lab
 */
public class PalindromicNumberPyramid {
    public static void main(String[] args) {
        // Define the number of rows for the pyramid
        int rows = 5;
        
        // Outer loop: controls the number of rows
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for centering the pyramid
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(" ");  // Print space for alignment
            }
            
            // Print decreasing numbers from current row number to 1
            for (int k = i; k >= 1; k--) {
                System.out.print(k);  // Print number without space
            }

            // Print increasing numbers from 2 to current row number
            // (excluding 1 to avoid duplication)
            for (int l = 2; l <= i; l++) {
                System.out.print(l);  // Print number without space
            }

            System.out.println();  // Move to next line after completing a row
        }
    }
}
