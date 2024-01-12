// 4	Write a Java program to print the area and perimeter of a rectangle. (use user input).

package First_Java_Assignment;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner getVal = new Scanner(System.in);

        // Getting the Inputs
        System.out.print("Enter Length: ");
        int l = getVal.nextInt();

        System.out.print("Enter breadth ");
        int b = getVal.nextInt();

        // Printing the calculated values
        System.out.println("Area = " + (l * b) + " Sq units");
        System.out.print("Perimeter = " + (2 * (l + b)) + " Units");

    }

}
