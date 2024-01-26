import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) {
        // Create an ArrayList to store numbers
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + numbersList);

        // Remove the third element
        int indexToRemove = 2; // Index of the element to remove
        numbersList.remove(indexToRemove);

        // Print the ArrayList after removal
        System.out.println("ArrayList after removing element at index " + indexToRemove + ": " + numbersList);
    }
    
}
