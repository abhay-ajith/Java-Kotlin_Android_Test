//•	Write a Java program to find the maximum and minimum value of an array.

import java.util.Scanner;


public class Q5 {
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

        // Find and display the maximum and minimum values
        int maxValue = findMaxValue(array);
        int minValue = findMinValue(array);

        System.out.println("Maximum value in the array: " + maxValue);
        System.out.println("Minimum value in the array: " + minValue);

    }

    // Method to find the maximum value in an array
    private static int findMaxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Method to find the minimum value in an array
    private static int findMinValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
}
