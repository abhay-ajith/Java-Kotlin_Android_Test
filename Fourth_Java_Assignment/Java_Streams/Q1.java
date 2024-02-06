package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double average = numbers.stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0.0);

        System.out.println("Average of the list: " + average);
    }
}
