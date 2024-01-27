//Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue. 

import java.util.PriorityQueue;

public class Q1 {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Add some integers to the priority queue
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Orange");
        priorityQueue.add("Blue");

        // Print out the elements of the priority queue
        System.out.println("PriorityQueue with integers: " + priorityQueue);
    }
}