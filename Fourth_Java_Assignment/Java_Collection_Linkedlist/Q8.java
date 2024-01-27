//Write a Java program to insert the specified element at the end of a linked list. 

package Java_Collection_Linkedlist;

import java.util.LinkedList;

public class Q8 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Print the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Insert a new element at the end
        int newEndElement = 40;
        linkedList.addLast(newEndElement);

        // Print the linked list after insertion
        System.out.println("Linked List after inserting '" + newEndElement + "' at the end: " + linkedList);
    }
}