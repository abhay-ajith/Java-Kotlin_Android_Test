import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        // Create an ArrayList to store elements
        ArrayList<Integer> List = new ArrayList<>();

        // Add some  to the ArrayList
        List.add(1);
        List.add(2);
        List.add(3);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + List);

        // Insert a new at the first position
        List.add(0, 0);

        // Print the ArrayList after insertion
        System.out.println("ArrayList after inserting " + 0 + " at the first position: " + List);
    }
    
}
