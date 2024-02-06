//Write a Java program to associate the specified value with the specified key in a HashMap.

package Java_Collection_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Q1 {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Associate a value with a key
        String key = "Key";
        int value = 1;
        hashMap.put(key, value);

        // Print the HashMap
        System.out.println("HashMap after associating value with key:");
        System.out.println(hashMap);    }
    
}
