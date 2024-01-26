package Java_Collection_HashSet;

import java.util.HashSet;

public class Q4 {
    public static void main(String[] args) {
        // Create a hash set
        HashSet<Integer> hashSet = new HashSet<>();

        // Add some elements to the hash set
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

        // Print the original hash set
        System.out.println("Original HashSet: " + hashSet);

        // Empty the hash set
        hashSet.clear();

        // Print the hash set after emptying
        System.out.println("HashSet after emptying: " + hashSet);
    }
}