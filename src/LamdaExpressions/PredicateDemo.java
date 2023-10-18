package LamdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Define a predicate to filter even numbers
        Predicate<Integer> evenPredicate = num -> num % 2 == 0;

        // Define a predicate to filter numbers greater than 5
        Predicate<Integer> greaterThan5Predicate = num -> num > 5;

        // Use the predicates to filter the list
        System.out.println("Even numbers:");
        filterAndPrint(numbers, evenPredicate);

        System.out.println("Numbers greater than 5:");
        filterAndPrint(numbers, greaterThan5Predicate);
    }

    // Generic method to filter and print elements based on a predicate
    public static <T> void filterAndPrint(List<T> list, Predicate<T> predicate) {
        for (T item : list) {
            if (predicate.test(item)) {
                System.out.print(item + " ");
            }
        }
        System.out.println();
    }
}

