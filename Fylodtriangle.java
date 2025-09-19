/**
 * Floyd's Triangle Pattern
 * 
 * This program creates Floyd's Triangle using consecutive natural numbers.
 * Numbers continue in sequence across rows, creating a triangular pattern.
 * 
 * Output Example (5 rows):
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10 
 * 11 12 13 14 15 
 * 
 * @author Mr-BlackHat-lab
 */
public class Fylodtriangle {
    public static void main(String[] args) {
        // Define the number of rows for Floyd's triangle
        int rows = 5;
        int number = 1;  // Starting number for the sequence
        
        // Outer loop: controls the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop: prints numbers equal to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");  // Print current number followed by space
                number++;  // Increment to next number in sequence
            }
            System.out.println();  // Move to next line after completing a row
        }
    }
}
