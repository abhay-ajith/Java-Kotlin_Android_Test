package Java_Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        try {
            checkNumbersFromFile("numbers.txt");
        } catch (PositiveNumberException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void checkNumbersFromFile(String fileName) throws FileNotFoundException, PositiveNumberException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > 0) {
                throw new PositiveNumberException("Positive number found: " + number);
            }
        }
        scanner.close();
        System.out.println("No positive numbers found in the file.");
    }
}

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}
