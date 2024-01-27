//Write a Java program to create an array list, add some colors (strings), and print out the collection.

import java.util.ArrayList;

public class Q1 {  
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> colorList = new ArrayList<>();

        // Add some colors to the ArrayList
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Purple");

        // Print out the collection
        System.out.println("Colors in the ArrayList:");

        for (String color : colorList) {
            System.out.println(color);
        }
    }
}
