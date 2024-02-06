package Java_Input_Output;

import java.io.File;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "C:/Users/Username/Documents";

        // Specify the file extension
        String fileExtension = ".txt";

        // Create a File object for the directory
        File directory = new File(directoryPath);

        // Get list of files in the directory with the specified extension
        File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(fileExtension));

        // Print the list of files with the specified extension
        System.out.println("Files with extension " + fileExtension + " in " + directoryPath + ":");
        Arrays.stream(files).map(File::getName).forEach(System.out::println);
    }
}
