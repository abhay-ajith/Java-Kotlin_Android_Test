// 7	Write a Java program to add two binary numbers and divide them. (both in different program).

package First_Java_Assignment;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner getVal = new Scanner(System.in);

        // Input Values
        System.out.print("Enter First Binary: ");
        String binary1 = getVal.next();
        System.out.print("Enter Second Binary: ");
        String binary2 = getVal.next();

        // Converting Binary String to integer
        int dec1 = Integer.parseInt(binary1, 2);
        int dec2 = Integer.parseInt(binary2, 2);

        // Calling Functions
        add(dec1, dec2);
        divide(dec1, dec2);
    }

    public static void add(int dec1, int dec2) {
        // Adding
        int sum = dec1 + dec2;
        System.out.println("Sum of two binary number is: " + (Integer.toBinaryString(sum)));

    }

    public static void divide(int dec1, int dec2) {
        // Division
        int div = dec1 / dec2;

        // Checking 0 Condition
        if (dec2 != 0) {
            System.out.println("Division of sum of two binary numbers: " + (Integer.toBinaryString(div)));
        } else {
            System.out.println("Invalid");
        }

    }
}
