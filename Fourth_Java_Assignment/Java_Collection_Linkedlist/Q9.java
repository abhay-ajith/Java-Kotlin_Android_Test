//Write a Java program to insert some elements at the specified position into a linked list.

package Java_Collection_Linkedlist;

import java.util.LinkedList;

public class Q9 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(50);

        // Print the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Specify the position to insert the new elements
        int insertPosition = 2;

        // Insert new elements at the specified position
        int newElement1 = 30;
        int newElement2 = 40;
        linkedList.add(insertPosition, newElement1);
        linkedList.add(insertPosition + 1, newElement2);

        // Print the linked list after insertions
        System.out.println("Linked List after inserting '" + newElement1 + "' and '" + newElement2 + "' at position "
                + insertPosition + ": " + linkedList);
    }
}