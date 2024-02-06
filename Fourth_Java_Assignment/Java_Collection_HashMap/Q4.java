package Java_Collection_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Q4 {
    public static void main(String[] args) {
        // Create map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Clear all mappings
        map.clear();

        // Print map after clearing
        System.out.println("Map after clearing:");
        System.out.println(map);
    }
}
