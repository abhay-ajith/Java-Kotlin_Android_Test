//Write a Java program to add all the elements of a priority queue to another priority queue. 

import java.util.PriorityQueue;

public class Q3 {

    public static void main(String[] args) {


        // Create the first priority queue
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.add(1);
        priorityQueue1.add(2);
        priorityQueue1.add(3);

        // Create the second priority queue
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.add(4);
        priorityQueue2.add(5);

        // Print the original priority queues
        System.out.println("PriorityQueue 1: " + priorityQueue1);
        System.out.println("PriorityQueue 2: " + priorityQueue2);

        // Add all elements of the first priority queue to the second priority queue
        priorityQueue2.addAll(priorityQueue1);

        // Print the second priority 
        System.out.println("PriorityQueue 2 after adding all elements from PriorityQueue 1: " + priorityQueue2);
    }
    
}
