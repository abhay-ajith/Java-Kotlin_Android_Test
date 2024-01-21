//•	Write a Java program to find the second smallest element in an array.

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        // Get array size from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        // Get array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Find and display the second smallest element
        int sndSmallest = findsndSmallestElement(array);
        System.out.println("Second smallest element in the array: " + sndSmallest);

    }

    // Method to find the second smallest element in an array
    private static int findsndSmallestElement(int[] array) {

        int smallest = Integer.MAX_VALUE;
        int sndSmallest = Integer.MAX_VALUE;

        for (int element : array) {
            if (element < smallest) {
                sndSmallest = smallest;
                smallest = element;
            } else if (element < sndSmallest && element != smallest) {
                sndSmallest = element;
            }
        }
        return sndSmallest;
    }
    
}
