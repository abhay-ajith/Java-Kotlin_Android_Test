package Java_Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        // Read file contents here
        scanner.close();
    }
}
