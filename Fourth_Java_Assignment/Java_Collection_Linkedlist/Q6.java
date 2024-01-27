//Write a Java program to insert elements into the linked list at the first and last positions.

package Java_Collection_Linkedlist;

import java.util.LinkedList;

public class Q6 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements to the linked list
        linkedList.add(20);
        linkedList.add(30);

        // Print the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Insert a new element at the first position
        int newFirstElement = 10;
        linkedList.addFirst(newFirstElement);

        // Insert a new element at the last position
        int newLastElement = 40;
        linkedList.addLast(newLastElement);

        // Print the linked list after insertions
        System.out.println("Linked List after inserting '" + newFirstElement + "' at the first position and '"
                + newLastElement + "' at the last position: " + linkedList);
    }
}