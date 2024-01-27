//Write a Java program to shuffle elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Q10 {
    public static void main(String[] args) {


        // Create an ArrayList to store elements
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + numbersList);

        // Shuffling
        Collections.shuffle(numbersList);

        // Print the ArrayList after shuffling
        System.out.println("ArrayList after shuffling: " + numbersList);
    }    
}
