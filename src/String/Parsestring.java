package String;

import java.util.Arrays;

public class Parsestring {
    public static void main(String[] args) {
        String inputString = "1         box has 3 blue 4 red 6 green and 12 yellow marbles";
        String[] words = inputString.split("\\s+"); // Split the string into words

        // Create an array to store the numbers
        int[] numbersArray = new int[words.length];
        int count = 0;

        // Iterate through the words and check if each word is a number
        for (String word : words) {
            try {
                int number = Integer.parseInt(word); // Try to parse the word as an integer
                numbersArray[count++] = number; // Store the number in the array
            } catch (NumberFormatException e) {
                // Ignore words that are not numbers
            }
        }

        // Create a new array with the exact size containing only the numbers
        int[] resultArray = new int[count];
        System.arraycopy(numbersArray, 0, resultArray, 0, count);

        // Print the numbers array
            System.out.println(Arrays.toString(resultArray));

    }
}
