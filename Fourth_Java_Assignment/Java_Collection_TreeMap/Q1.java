//Write a Java program to associate the specified value with the specified key in a Tree Map.

package Java_Collection_TreeMap;

import java.util.TreeMap;

public class Q1 {

    public static void main(String[] args) {

        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Associate a value with a key
        String key = "Key";
        int value = 1;
        treeMap.put(key, value);

        // Print the TreeMap
        System.out.println("TreeMap after associating value with key:");
        System.out.println(treeMap);
    }
    
}
