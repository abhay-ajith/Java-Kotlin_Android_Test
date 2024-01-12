// 6	In above program with user input and without using third variable. 

package First_Java_Assignment;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        // Input values
        Scanner getVal = new Scanner(System.in);
        System.out.print("First Num : ");
        int i = getVal.nextInt();
        System.out.print("Second Num : ");
        int j = getVal.nextInt();

        // Swaping Values
        i = i + j;
        j = i - j;
        i = i - j;

        // Output
        System.out.println("First Num : " + i);
        System.out.println("Second Num : " + j);
    }
}
