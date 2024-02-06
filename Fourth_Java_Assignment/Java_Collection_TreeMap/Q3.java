package Java_Collection_TreeMap;

import java.util.TreeMap;

public class Q3 {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add elements to the TreeMap
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");

        // Search for a key
        int keyToSearch = 3;
        if (treeMap.containsKey(keyToSearch)) {
            System.out.println("Key " + keyToSearch + " found with value: " + treeMap.get(keyToSearch));
        } else {
            System.out.println("Key " + keyToSearch + " not found.");
        }
    }
}
