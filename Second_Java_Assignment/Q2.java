//•	Write a Java program to find the index of an array element.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Get array size from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.print("Enter the data: ");
        int data = sc.nextInt();

        int[] array = new int[size];

        // Get array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        //Calling method
        int index =  findIndex(array,data);
        if(index==-1){
            System.out.println("NO data Found");
        }
        else{
        System.out.println(index);
        }
    }

    private static int findIndex(int[] array,int data){
        for(int i :array){
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }
} 

