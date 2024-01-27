//Write a Java program to insert a given element into a priority queue. 

import java.util.PriorityQueue;

public class Q4 {

    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add some integers to the priority queue
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(5);

        // Print the original priority queue
        System.out.println("Original PriorityQueue: " + priorityQueue);

        // Insert a given element into the priority queue
        int newElement = 8;
        priorityQueue.add(newElement);

        // Print the priority queue after insertion
        System.out.println("PriorityQueue after inserting '" + newElement + "': " + priorityQueue);
    }
    
}
