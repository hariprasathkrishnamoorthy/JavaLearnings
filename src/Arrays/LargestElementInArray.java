package Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        // Initialize an integer array
        int[] numbers = {10, 5, 20, 8, 15};

        // Find the largest element in the array
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest/Maximum element in the array: " + largest);
    }
}

