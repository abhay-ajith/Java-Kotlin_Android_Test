package Java_Collection_TreeSet;

import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {
        // Create the first tree set
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(10);
        treeSet1.add(5);
        treeSet1.add(20);

        // Create the second tree set
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        treeSet2.add(15);
        treeSet2.add(25);

        // Print the original tree sets
        System.out.println("TreeSet 1: " + treeSet1);
        System.out.println("TreeSet 2: " + treeSet2);

        // Add all elements of the first tree set to the second tree set
        treeSet2.addAll(treeSet1);

        // Print the second tree set after addition
        System.out.println("TreeSet 2 after adding all elements from TreeSet 1: " + treeSet2);
    }
}