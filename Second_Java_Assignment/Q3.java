//•	Write a Java program to remove a specific element from an array.

import java.util.Scanner;


public class Q3 {
    public static void main(String[] args) {

        // Get array size from the user
        Scanner sc = new sScanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        // Get array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Get the element to be removed from the user
        System.out.print("Enter the element to be removed: ");
        int eleToRemove = sc.nextInt();

        // Remove the specified element
        array = rmEle(array, eleToRemove);

        // Display the updated array
        System.out.println("Array after removing " + eleToRemove + ":");
        for (int value : array) {
            System.out.print(value + " ");
        }

    }

    // Method to remove a specific element from an array
    private static int[] rmEle(int[] array, int element) {
        int newSize = array.length - 1;
        int[] newArray = new int[newSize];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                newArray[newIndex++] = array[i];
            }
        }

        return newArray;
    }
    
}
