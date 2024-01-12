// 9	Write a Java program to convert an octal number to a hexadecimal number.

package First_Java_Assignment;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner getVal = new Scanner(System.in);

        // INput Values
        System.out.println("Enter the Binary Number");
        String oct = getVal.nextLine();

        // Converting Binary String to Integer
        int dec = Integer.parseInt(oct, 8);

        // Converting interger to Hex String
        String hex = Integer.toHexString(dec);

        // Output
        System.out.println("Hexa of " + oct + " is: " + hex);
    }
}
