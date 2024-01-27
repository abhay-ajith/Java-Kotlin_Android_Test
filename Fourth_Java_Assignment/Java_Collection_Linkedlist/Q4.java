//Write a Java program to iterate a linked list in reverse order. 

package Java_Collection_Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Q4 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        // Print the linked list in reverse order
        System.out.println("Iterating through elements in the Linked List in reverse order:");
        Iterator<Integer> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}