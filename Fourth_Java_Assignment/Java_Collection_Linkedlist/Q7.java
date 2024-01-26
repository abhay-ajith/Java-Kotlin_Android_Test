package Java_Collection_Linkedlist;

import java.util.LinkedList;

public class Q7 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements to the linked list
        linkedList.add(20);
        linkedList.add(30);

        // Print the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Insert a new element at the front
        int newFrontElement = 10;
        linkedList.addFirst(newFrontElement);

        // Print the linked list after insertion
        System.out.println("Linked List after inserting '" + newFrontElement + "' at the front: " + linkedList);
    }
}