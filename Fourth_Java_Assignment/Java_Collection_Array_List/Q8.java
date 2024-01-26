import java.util.ArrayList;
import java.util.Collections;

public class Q8 {
    public static void main(String[] args) {
        // Create an ArrayList to store numbers
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbersList.add(50);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(10);
        numbersList.add(40);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + numbersList);

        // Sort the ArrayList
        Collections.sort(numbersList);

        // Print the ArrayList after sorting
        System.out.println("ArrayList after sorting: " + numbersList);
    }    
}
