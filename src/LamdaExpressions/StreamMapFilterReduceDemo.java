package LamdaExpressions;

import java.util.Arrays;
import java.util.List;

public class StreamMapFilterReduceDemo {

    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use Stream to filter even numbers, square them, and then calculate their sum
        int result = numbers.stream()
                .filter(num -> num % 2 == 0)          // Filter even numbers
                .map(num -> num * num)               // Square each number
                .reduce(0, (a, b) -> a + b);          // Calculate the sum

        // Print the result
        System.out.println("Sum of squares of even numbers: " + result);
    }
}

