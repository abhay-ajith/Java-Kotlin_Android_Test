//Write a Java program to remove all elements from a priority queue.

import java.util.PriorityQueue;

public class Q5 {

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

        // Remove all elements from the priority queue
        priorityQueue.clear();

        // Print the priority queue 
        System.out.println("PriorityQueue after removing all elements: " + priorityQueue);
    }
    
}
