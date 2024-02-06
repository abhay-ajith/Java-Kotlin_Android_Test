package Java_Collection_TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class Q5 {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add elements to the TreeMap
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");

        // Get all keys from the TreeMap
        Set<Integer> keys = treeMap.keySet();

        // Print all keys
        System.out.println("Keys in the TreeMap:");
        for (Integer key : keys) {
            System.out.println(key);
        }
    }
}
