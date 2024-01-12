// 3	Write a Java program that takes a number as input and prints its multiplication table up to 10. (Hint- use Loop).

package First_Java_Assignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner getVal = new Scanner(System.in);

        // Getting the Input
        System.out.print("Enter the number: ");
        int num = getVal.nextInt();

        // Calling the function
        printMultiTable(num);

    }

    private static void printMultiTable(int num) {
        // Printing the Table
        for (int i = 1; i < 11; i++) {
            System.out.println((num) + " x " + (i) + " = " + (num * i));
        }
    }
}
