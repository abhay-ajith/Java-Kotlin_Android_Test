/* 18	Write a Java program that accepts two integer values from the user and returns the largest value. 
        However, if the two values are the same, return 0 
        and find the smallest value if the two values have the same remainder when divided by 6.
*/

package First_Java_Assignment;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner getVal = new Scanner(System.in);

        // INput Values
        System.out.println("First Number: ");
        int i = getVal.nextInt();
        System.out.println("Second Number: ");
        int j = getVal.nextInt();

        // Finding the Remainder
        int r1 = i % 6;
        int r2 = j % 6;

        // Calling the func
        int l = largest(i, j);
        System.out.println("Largest " + l);

        // Checking the conditions & calling the func
        if (r1 == r2) {
            int s = smallest(i, j);
            System.out.println("Smallest " + s);
        } else {
            System.out.println("No Valid Smallest");
        }
    }

    private static int largest(int i, int j) {
        // Returns the largest
        if (i > j) {
            return i;
        } else if (j > i) {
            return j;
        } else {
            return 0;
        }
    }

    private static int smallest(int i, int j) {
        // Returns the smallest
        if (i > j) {
            return j;
        } else {
            return i;
        }
    }
}
