// 5	Write a Java program to swap two variables.

package First_Java_Assignment;

public class Q5 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("First num : " + i);
        int j = 2;
        System.out.println("First num : " + j);
        int t;

        System.out.println();

        // Swapping
        t = i;
        i = j;
        j = t;

        // Printing the swapped values
        System.out.println("First num : " + i);
        System.out.println("Second num : " + j);

    }

}
