//•	Write a Java program to find common elements between two integer arrays

import java.util.Scanner;
public class Q7 {

    public static void main(String[] args) {

        // Get sizes of the two arrays from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();

        // Create the first array and get elements from the user
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }

        // Create the second array and get elements from the user
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }

        // Find and display common elements
        findcomEle(arr1, arr2);
    }

    // Method to find and display common elements between two arrays
    private static void findcomEle(int[] arr1, int[] arr2) {
        System.out.println("Common elements between the two arrays:");

        for (int element1 : arr1) {
            for (int element2 : arr2) {
                if (element1 == element2) {
                    System.out.print(element1 + " ");
                    break; 
                }
            }
        }

        System.out.println(); 
    }
    
}
