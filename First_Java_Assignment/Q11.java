// 11	Write a Java program to count letters, spaces, numbers and other characters in an input string.

package First_Java_Assignment;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner getSting = new Scanner(System.in);

        // Get String
        System.out.println("Enter the String: ");
        String s = getSting.nextLine();

        // Counting variables
        int letter = 0;
        int space = 0;
        int numbers = 0;
        int others = 0;

        // Converting String to character array
        char[] c = s.toCharArray();

        // Counting
        for (char i : c) {
            if (Character.isLetter(i)) {
                letter++;
            } else if (Character.isDigit(i)) {
                numbers++;
            } else if (Character.isWhitespace(i)) {
                space++;
            } else {
                others++;
            }

        }

        // Output
        System.out.println("Letters = " + letter);
        System.out.println("Spaces = " + space);
        System.out.println("Numbers = " + numbers);
        System.out.println("Others = " + others);
    }

}
