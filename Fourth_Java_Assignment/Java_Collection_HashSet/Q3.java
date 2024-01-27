//Write a Java program to get the number of elements in a hash set. 

package Java_Collection_HashSet;

import java.util.HashSet;

public class Q3 {
    public static void main(String[] args) {
        // Create a hash set
        HashSet<Integer> hashSet = new HashSet<>();

        // Add some elements to the hash set
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

        // Get the number of elements in the hash set
        int numberOfElements = hashSet.size();

        // Print the number of elements
        System.out.println("Number of elements in the HashSet: " + numberOfElements);
    }
}