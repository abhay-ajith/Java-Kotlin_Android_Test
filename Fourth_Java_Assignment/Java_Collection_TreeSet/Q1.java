package Java_Collection_TreeSet;

import java.util.TreeSet;

public class Q1 {
    public static void main(String[] args) {
        // Create a tree set
        TreeSet<String> treeSet = new TreeSet<>();

        // Add some integers to the tree set
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");
        treeSet.add("Orange");
        // Print out the tree set
        System.out.println("TreeSet with integers: " + treeSet);
    }
}