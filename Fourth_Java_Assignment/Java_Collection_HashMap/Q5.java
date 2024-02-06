package Java_Collection_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Q5 {
    public static void main(String[] args) {
        // Create map
        Map<Integer, String> map = new HashMap<>();

        // Check if map is empty
        boolean isEmpty = map.isEmpty();

        // Print result
        if (isEmpty) {
            System.out.println("Map is empty");
        } else {
            System.out.println("Map is not empty");
        }
    }
}
