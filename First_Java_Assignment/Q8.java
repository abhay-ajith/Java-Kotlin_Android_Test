// 8	Write a Java program to convert a binary number to an octal number.

package First_Java_Assignment;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner getVal = new Scanner(System.in);

        // INput Values
        System.out.println("Enter the Binary Number");
        String bin = getVal.next();

        // Converting Binary String to Integer
        int dec = Integer.parseInt(bin, 2);

        // Converting interger to Octal String
        String oct = Integer.toOctalString(dec);

        // Output
        System.out.println("Octal of " + bin + " is: " + oct);
    }

}
