//Write a Java program to insert the specified element at the specified position in the linked list.

package Java_Collection_Linkedlist;

import java.util.LinkedList;

public class Q5 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(40);
        linkedList.add(50);

        // Specify the position to insert the new element
        int insertPosition = 2;

        // Insert a new element at the specified position
        int newElement = 30;
        linkedList.add(insertPosition, newElement);

        // Print the linked list after insertion
        System.out.println("Linked List after inserting '" + newElement + "' at position " + insertPosition + ": " + linkedList);
    }
}