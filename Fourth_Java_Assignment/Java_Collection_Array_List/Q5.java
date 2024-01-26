import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        // Create an ArrayList to store integer elements
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + numbersList);

        // Update the element at a specific index
        int indexToUpdate = 2; // Index of the element to update
        int newNumber = 35; // New element to replace the existing one
        numbersList.set(indexToUpdate, newNumber);

        // Print the ArrayList after the update
        System.out.println("ArrayList after updating element at index " + indexToUpdate + ": " + numbersList);
    }    
}
