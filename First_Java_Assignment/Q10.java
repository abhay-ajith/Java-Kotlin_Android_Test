// 10	Write a Java program to compare two numbers. (take user input).

package First_Java_Assignment;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner getVal = new Scanner(System.in);

        // Get Values
        int i = getVal.nextInt();
        int j = getVal.nextInt();

        // Compare
        if (i > j) {
            System.out.println(i);
        } else {
            System.out.println(j);
        }
    }
}
