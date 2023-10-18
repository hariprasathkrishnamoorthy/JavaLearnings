package LamdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalStreamDemo {

    public static void main(String[] args) {
        // Create a list of numbers with some potential null or empty values
        List<Optional<Integer>> numbers = Arrays.asList(
                Optional.of(5),
                Optional.ofNullable(null),
                Optional.of(10),
                Optional.empty(),
                Optional.of(3)
        );

        // Use Stream to find the maximum value while handling null or empty values
        Optional<Integer> maxNumber = numbers.stream()
                .flatMap(Optional::stream)  // Convert Optional to Stream
                .max(Integer::compareTo);   // Find the maximum value

        // Print the result
        if (maxNumber.isPresent()) {
            System.out.println("Maximum value: " + maxNumber.get());
        } else {
            System.out.println("No maximum value found.");
        }
    }
}
