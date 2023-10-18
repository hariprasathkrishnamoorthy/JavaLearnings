package LamdaExpressions;

 import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {

    public static void main(String[] args) {
        // Create a list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace");

        // Use the Stream API to filter names starting with the letter "D"
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("D"))
                .collect(Collectors.toList());

        // Print the filtered names
        System.out.println("Names starting with 'D': " + filteredNames);
    }
}
