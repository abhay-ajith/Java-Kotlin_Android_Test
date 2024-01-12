// 15	Take input of age of 3 people by user and determine oldest and youngest among them.

package First_Java_Assignment;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner getAge = new Scanner(System.in);

        // Input Ages
        System.out.println("Enter age of p1: ");
        int p1 = getAge.nextInt();
        System.out.println("Enter age of p2: ");
        int p2 = getAge.nextInt();
        System.out.println("Enter age of p3: ");
        int p3 = getAge.nextInt();

        // Checks Oldest and prints
        if (p1 > p2 && p1 > p3) {
            System.out.println("Oldest " + p1);
        } else if (p2 > p3) {
            System.out.println("Oldest " + p2);
        } else {
            System.out.println("Oldest " + p3);
        }

        // Checks Younges and prints
        if (p1 < p2 && p1 < p3) {
            System.out.println("Youngest " + p1);
        } else if (p2 < p3) {
            System.out.println("Youngest " + p2);
        } else {
            System.out.println("Youngest " + p3);
        }

    }
}
