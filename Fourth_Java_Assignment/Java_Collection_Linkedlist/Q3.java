package Java_Collection_Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Q3 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        // Specify the position to start iterating
        int startPosition = 2;

        // Print the linked list starting from the specified position
        System.out.println("Iterating through elements in the Linked List starting from position " + startPosition + ":");
        Iterator<Integer> iterator = linkedList.listIterator(startPosition);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}