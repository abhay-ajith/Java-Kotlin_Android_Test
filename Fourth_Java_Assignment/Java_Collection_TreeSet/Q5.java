package Java_Collection_TreeSet;

import java.util.TreeSet;

public class Q5 {
    public static void main(String[] args) {
        // Create a tree set
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some integers to the tree set
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(25);

        // Get the first and last elements
        Integer firstElement = treeSet.first();
        Integer lastElement = treeSet.last();

        // Print the first and last elements
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
    }
}