package Java_Collection_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Q2 {
    public static void main(String[] args) {
        // Create a hash set
        HashSet<Integer> hashSet = new HashSet<>();

        // Add some elements to the hash set
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

        // Print the hash set using an iterator
        System.out.println("Iterating through elements in the HashSet:");
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}