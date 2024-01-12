// 17	Write a program on reverse star pattern.

package First_Java_Assignment;

public class Q17 {
    public static void main(String[] args) {

        // To print the pattern
        for (int i = 3; i >= 1; i--) {

            // Prints the spaces
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }

            // Prints the *
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Newline
            System.out.println();
        }
    }
}
