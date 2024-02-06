package Java_Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = Arrays.asList("apple", "Banana", "CHERRY", "date", "Elderberry");

        // Lambda expression to convert a list of strings to uppercase
        CaseConversionFunction uppercaseFunction = list -> list.stream().map(String::toUpperCase).collect(Collectors.toList());

        // Lambda expression to convert a list of strings to lowercase
        CaseConversionFunction lowercaseFunction = list -> list.stream().map(String::toLowerCase).collect(Collectors.toList());

        // Test the lambda expressions
        System.out.println("Original list: " + strings);
        System.out.println("Uppercase list: " + uppercaseFunction.convert(strings));
        System.out.println("Lowercase list: " + lowercaseFunction.convert(strings));
    }
}

interface CaseConversionFunction {
    List<String> convert(List<String> list);
}
