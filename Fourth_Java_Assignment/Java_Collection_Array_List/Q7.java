//Write a Java program to search for an element in an array list. 

import java.util.ArrayList;

public class Q7 {
    public static void main(String[] args) {
        // Create an ArrayList to store numbers
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + numbersList);

        // Search for an element in the ArrayList
        int elementToSearch = 30;
        int index = numbersList.indexOf(elementToSearch);

        // Check if the element is found
        if (index != -1) {
            System.out.println("Element " + elementToSearch + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the ArrayList.");
        }
    }
    
}
