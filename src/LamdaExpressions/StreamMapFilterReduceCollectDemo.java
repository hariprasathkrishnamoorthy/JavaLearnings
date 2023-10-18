package LamdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilterReduceCollectDemo {

    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use Stream to filter even numbers, square them, and collect the results into a new list
        List<Integer> squaredEvenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)          // Filter even numbers
                .map(num -> num * num)               // Square each number
                .collect(Collectors.toList());        // Collect results into a list

        // Print the result
        System.out.println("Squared even numbers: " + squaredEvenNumbers);
    }
}

