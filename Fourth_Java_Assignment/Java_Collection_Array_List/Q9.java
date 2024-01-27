//Write a Java program to copy one array list into another. 

import java.util.ArrayList;

public class Q9 {
    public static void main(String[] args) {
        // Create the source ArrayList
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Orange");
        sourceList.add("Grapes");
        sourceList.add("Mango");

        // Print the original source ArrayList
        System.out.println("Source ArrayList: " + sourceList);

        // Create a new ArrayList and copy 
        ArrayList<String> destinationList = new ArrayList<>(sourceList);

        // Print the destination ArrayList
        System.out.println("Destination ArrayList: " + destinationList);
    }    
}
