//Write a Java program to append the specified element to the end of a linked list.

package Java_Collection_Linkedlist;
import java.util.LinkedList;

public class Q1 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Print the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Append a new element to the end of the linked list
        int newElement = 40;
        linkedList.addLast(newElement);

        // Print the linked list after appending
        System.out.println("Linked List after appending '" + newElement + "': " + linkedList);
    }
    
}
