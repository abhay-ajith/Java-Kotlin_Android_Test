package Java_Collection_Linkedlist;

import java.util.LinkedList;

public class Q10 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(20);
        linkedList.add(40);

        // Print the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Specify the elements to find occurrences
        int elementToFind1 = 20;
        int elementToFind2 = 50;

        // Get the first occurrence of specified elements
        int firstOccurrence1 = linkedList.indexOf(elementToFind1);
        int firstOccurrence2 = linkedList.indexOf(elementToFind2);

        // Get the last occurrence of specified elements
        int lastOccurrence1 = linkedList.lastIndexOf(elementToFind1);
        int lastOccurrence2 = linkedList.lastIndexOf(elementToFind2);

        // Print the occurrences
        System.out.println("First occurrence of " + elementToFind1 + ": " + firstOccurrence1);
        System.out.println("First occurrence of " + elementToFind2 + ": " + firstOccurrence2);
        System.out.println("Last occurrence of " + elementToFind1 + ": " + lastOccurrence1);
        System.out.println("Last occurrence of " + elementToFind2 + ": " + lastOccurrence2);
    }
}