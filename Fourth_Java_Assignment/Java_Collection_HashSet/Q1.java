package Java_Collection_HashSet;

import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
        // Create a hash set
        HashSet<Integer> hashSet = new HashSet<>();

        // Add some elements to the hash set
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

        // Print the original hash set
        System.out.println("Original HashSet: " + hashSet);

        // Append a new element to the hash set
        int newElement = 40;
        hashSet.add(newElement);

        // Print the hash set after appending
        System.out.println("HashSet after appending '" + newElement + "': " + hashSet);
    }
}