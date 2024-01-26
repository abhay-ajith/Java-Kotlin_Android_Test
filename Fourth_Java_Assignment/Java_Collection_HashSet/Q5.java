package Java_Collection_HashSet;

import java.util.HashSet;

public class Q5 {
    public static void main(String[] args) {
        // Create an empty hash set
        HashSet<Integer> emptyHashSet = new HashSet<>();

        // Create a non-empty hash set
        HashSet<Integer> nonEmptyHashSet = new HashSet<>();
        nonEmptyHashSet.add(10);
        nonEmptyHashSet.add(20);

        // Test if hash sets are empty
        boolean isEmpty1 = emptyHashSet.isEmpty();
        boolean isEmpty2 = nonEmptyHashSet.isEmpty();

        // Print the results
        System.out.println("Is the first HashSet empty? " + isEmpty1);
        System.out.println("Is the second HashSet empty? " + isEmpty2);
    }
}