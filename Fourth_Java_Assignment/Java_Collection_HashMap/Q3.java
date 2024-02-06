package Java_Collection_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static void main(String[] args) {
        // Create source map
        Map<Integer, String> sourceMap = new HashMap<>();
        sourceMap.put(1, "One");
        sourceMap.put(2, "Two");
        sourceMap.put(3, "Three");

        // Create destination map
        Map<Integer, String> destinationMap = new HashMap<>();

        // Copy mappings from source to destination
        destinationMap.putAll(sourceMap);

        // Print destination map
        System.out.println("Destination Map after copying:");
        System.out.println(destinationMap);
    }
}
