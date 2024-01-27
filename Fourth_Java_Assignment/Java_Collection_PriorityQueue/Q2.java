//Write a Java program to iterate through all elements in the priority queue.

import java.util.Iterator;
import java.util.PriorityQueue;

public class Q2 {

    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add some integers to the priority queue
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(5);


        // Iterate through all elements
        System.out.println("Iterating through elements in the PriorityQueue:");
        Iterator<Integer> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
