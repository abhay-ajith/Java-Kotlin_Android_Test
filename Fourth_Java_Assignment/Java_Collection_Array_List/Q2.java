import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {

        // Create an ArrayList to store colors
        ArrayList<String> List = new ArrayList<>();

        // Add some colors to the ArrayList
        List.add("1");
        List.add("2");
        List.add("3");
        List.add("4");
        List.add("5");

        // Print out the collection
        System.out.println("ArrayList:");

        for (String n : List) {
            System.out.println(n);
        }
    }
}
