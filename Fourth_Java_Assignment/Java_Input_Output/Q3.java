package Java_Input_Output;

import java.io.File;

public class Q3 {
    public static void main(String[] args) {
        // Specify the file or directory pathname
        String pathName = "C:/Users/Username/Documents/example.txt";

        // Create a File object for the specified pathname
        File file = new File(pathName);

        // Check if the file or directory exists
        if (file.exists()) {
            System.out.println("File or directory exists.");
        } else {
            System.out.println("File or directory does not exist.");
        }
    }
}
