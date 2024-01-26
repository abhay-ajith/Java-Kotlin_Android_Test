package Java_Collection_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Q4 {
    public static void main(String[] args) {
        // Create a tree set
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some integers to the tree set
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(25);

        // Create a reverse order view using descendingIterator
        System.out.println("Reverse Order View of elements in the TreeSet:");
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}