//•	Write a Java program to find duplicate values in an array of string values.

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {


        // Get array size from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        String[] array = new String[size];

        // Get array elements from the user
        System.out.println("Enter the string elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.next();
        }

        // Find and display duplicate values
        findDuplicates(array);
    }

    // Method to find duplicate values in an array of strings
    private static void findDuplicates(String[] array) {
        boolean d = false;

        // Compare each element with every other element
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    d = true;
                    System.out.println("Duplicate found: " + array[i]);
                }
            }
        }

        if (!d) {
            System.out.println("No duplicates found in the array.");
        }
    }
    
}
