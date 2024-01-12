/** 19	Write a Java program to accept a number and check whether the number is even or not. 
        Prints 1 if the number is even or 0 if odd.
*/

package First_Java_Assignment;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner getVal = new Scanner(System.in);

        // Get INput
        System.out.println("Enter the Number: ");
        int i = getVal.nextInt();

        // Checking the condition and return the values
        int res = (i % 2 == 0) ? 1 : 0;

        // Output
        System.out.println("1 or 0 " + res);
    }
}
