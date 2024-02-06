package Java_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "Banana", "CHERRY", "date", "Elderberry");

        // Convert to uppercase
        List<String> upperCaseStrings = strings.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());
        System.out.println("Uppercase strings: " + upperCaseStrings);

        // Convert to lowercase
        List<String> lowerCaseStrings = strings.stream()
                                               .map(String::toLowerCase)
                                               .collect(Collectors.toList());
        System.out.println("Lowercase strings: " + lowerCaseStrings);
    }
}
