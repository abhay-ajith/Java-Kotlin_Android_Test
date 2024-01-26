import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Create an ArrayList to store elements
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("enter the index : ");
        Scanner sc =new Scanner(System.in);
        int index= sc.nextInt();
        // Add some  to the ArrayList
        List.add(1);
        List.add(2);
        List.add(3);

        System.out.println(List.get(index));
    }    
}
