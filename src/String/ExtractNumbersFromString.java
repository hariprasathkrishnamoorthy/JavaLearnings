package String;

import java.util.Arrays;
import java.util.regex.*;

public class ExtractNumbersFromString {
    public static void main(String[] args) {
        String input = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        int[] numbers = extractNumbers(input);

        System.out.println(numbers);

        System.out.println(Arrays.toString(numbers));

        // Print the extracted numbers
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] extractNumbers(String input) {
        // Define a regular expression pattern to match numbers
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        int[] numbers = new int[count];
        matcher.reset();

        int index = 0;
        while (matcher.find()) {
            numbers[index++] = Integer.parseInt(matcher.group());
        }

        return numbers;
    }
}
