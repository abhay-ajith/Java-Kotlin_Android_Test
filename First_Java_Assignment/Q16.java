// 16	Write a program triangle star Pattern.

package First_Java_Assignment;

public class Q16 {
    public static void main(String[] args) {

        // To print the pattern
        for (int i = 1; i <= 3; i++) {

            // Prints the spaces
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }

            // Prints the *
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Newline
            System.out.println();
        }
    }
}
