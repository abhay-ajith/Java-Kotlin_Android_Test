//•	Write a Java program to insert an element (specific position) into an array.

import java.util.Scanner;



public class Q4 {
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

        // Get the element to be inserted
        System.out.print("Enter the element to be inserted: ");
        int elementToInsert = sc.nextInt();

        // Get the position to insert the element
        System.out.print("Enter the position to insert the element (1 to " + size + "): ");
        int position = sc.nextInt();

        // Insert the element at the specified position
        array = insertEle(array, elementToInsert, position);

        // Display the updated array
        System.out.println("Array after inserting " + elementToInsert + " at position " + position + ":");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    // Method to insert an element at a specific position in an array
    private static int[] insertEle(int[] array, int element, int position) {
        int newSize = array.length + 1;
        int[] newArray = new int[newSize];
        int newIndex = 0;

        for (int i = 0; i < newSize; i++) {
            if (i == position - 1) {
                newArray[newIndex++] = element;
            }
            if (i < array.length) {
                newArray[newIndex++] = array[i];
            }
        }

        return newArray;
    }
    
}
