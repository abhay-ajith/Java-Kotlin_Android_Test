package Java_Collection_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Q2 {
    public static void main(String[] args) {
        // Create a tree set
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some integers to the tree set
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(25);

        // Iterate through all elements in the tree set
        System.out.println("Iterating through elements in the TreeSet:");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}