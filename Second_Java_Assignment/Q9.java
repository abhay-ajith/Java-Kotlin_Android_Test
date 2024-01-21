//•	Write a Java program to find a missing number in an array.

import java.util.Scanner;


public class Q9 {

    public static void main(String[] args) {
        // Get array size from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // one size reduced
        int[] array = new int[size - 1]; 


        // Get array elements from the user -1
        System.out.println("Enter " + (size - 1) + " elements of the array in order :");
        for (int i = 0; i < size - 1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Find and display the missing number
        int missingNumber = findMissingNumber(array, size);
        System.out.println("Missing number in the array: " + missingNumber);

    }

    // Method to find the missing number in an array
    private static int findMissingNumber(int[] array, int size) {
        // Calculate the expected sum of elements with the missing number
        int expectedSum = (size * (size + 1)) / 2;

        // Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int i : array) {
            actualSum += i;
        }

        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }
    
}
