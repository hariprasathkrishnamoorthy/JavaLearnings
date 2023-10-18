package LamdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class PredicateStreamDemo {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Define a predicate to filter even numbers
        Predicate<Integer> evenPredicate = num -> num % 2 == 0;

        // Use Stream with filter and map to filter even numbers, square them, and collect the results
        List<Integer> evenSquaredNumbers = numbers.stream()
                .filter(evenPredicate)                  // Filter even numbers
                .map(num -> num * num)                 // Square each even number
                .collect(Collectors.toList());          // Collect results into a list

        // Print the result
        System.out.println("Even numbers squared: " + evenSquaredNumbers);
    }
}

