// 2	For above program take input from user.

package First_Java_Assignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner getVal = new Scanner(System.in);

        // Getting the Inputs
        System.out.print("Enter First Value: ");
        int num1 = getVal.nextInt();
        System.out.print("Enter Second Value: ");
        int num2 = getVal.nextInt();

        // Printing the calculated values
        System.out.println("Sum : " + (num1 + num2));
        System.out.println("Subtraction : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));

        // Checking the 0 condition for division
        if (num2 != 0) {
            System.out.println("Division : " + (num1 / num2));
        } else {
            System.out.println("Division cannot be performed");
        }

    }

}
