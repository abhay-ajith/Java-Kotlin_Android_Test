//Write a Java program to copy Tree Map's content to another Tree Map. 

package Java_Collection_TreeMap;

import java.util.TreeMap;

public class Q2 {

    public static void main(String[] args) {
        // Create the first TreeMap
        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        treeMap1.put("key1", 1);
        treeMap1.put("key2", 2);
        treeMap1.put("key3", 3);

        // Create the second TreeMap and copy the content
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(treeMap1);

        // Print the original and copied TreeMaps
        System.out.println("Original TreeMap: " + treeMap1);
        System.out.println("Copied TreeMap: " + treeMap2);
    }
    
}
