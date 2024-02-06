package Java_Input_Output;

import java.io.File;
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "C:/Users/Username/Documents";

        // Create a File object for the directory
        File directory = new File(directoryPath);

        // Get list of all files and directories in the directory
        String[] filesAndDirs = directory.list();

        // Print the list of files and directories
        System.out.println("Files and directories in " + directoryPath + ":");
        Arrays.stream(filesAndDirs).forEach(System.out::println);
    }
}
