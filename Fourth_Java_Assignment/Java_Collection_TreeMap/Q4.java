package Java_Collection_TreeMap;

import java.util.TreeMap;

public class Q4 {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add elements to the TreeMap
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");

        // Search for a value
        String valueToSearch = "Three";
        if (treeMap.containsValue(valueToSearch)) {
            System.out.println("Value \"" + valueToSearch + "\" found in the TreeMap.");
        } else {
            System.out.println("Value \"" + valueToSearch + "\" not found.");
        }
    }
}
