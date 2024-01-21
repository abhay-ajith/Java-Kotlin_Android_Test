//•	Write a Java program to check if an array of integers is without 0 and -1

import java.util.Scanner;


public class Q10 {

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

        // Check if the array contains 0 or -1
        boolean isTorN = checkArray(array);

        // Display the result
        if (isTorN) {
            System.out.println("The array contains 0 or -1.");
        } else {
            System.out.println("The array does not contain 0 or -1.");
        }

    }

    // Method to check if an array contains 0 or -1
    private static boolean checkArray(int[] array) {
        for (int element : array) {
            if (element == 0 || element == -1) {
                return true; 
            }
        }
        return false; 
    }
    
}
