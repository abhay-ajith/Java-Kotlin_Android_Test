// 12	Write a Java program to print the ASCII value of a given character.

package First_Java_Assignment;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner getChar = new Scanner(System.in);

        // Input Character
        System.out.println("Enter the Character: ");
        char ch = getChar.next().charAt(0);

        // Converting to ascii
        int ascii = ch;

        // Output
        System.out.println("Ascii value of " + ch + " is " + ascii);
    }
}
