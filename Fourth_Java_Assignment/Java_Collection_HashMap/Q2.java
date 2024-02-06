//Write a Java program to count the number of key-value (size) mappings in a map. 

package Java_Collection_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Associate some values with keys
        hashMap.put("key1", 1);
        hashMap.put("key2", 2);
        hashMap.put("key3", 3);

        // Count the number of key-value mappings in the HashMap
        int size = hashMap.size();

        // Print the number of mappings
        System.out.println("Number of key-value mappings in the HashMap: " + size);
    }    
}
