package Java_Collection_Linkedlist;
import java.util.Iterator;
import java.util.LinkedList;

public class Q2 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Print the linked list using an iterator
        System.out.println("Iterating through elements in the Linked List:");
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
