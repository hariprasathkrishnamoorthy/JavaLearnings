package Arrays;

import java.util.Arrays;

public class ArrayMethodsExample {
    public static void main(String[] args) {


        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Calculate the length of the merged array
        int mergedLength = array1.length + array2.length;

        // Create a merged array with the calculated length
        int[] mergedArray = new int[mergedLength];

        // Copy elements from array1 to the merged array
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

        // Copy elements from array2 to the merged array
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);




        // Initialize an array
        int[] numbers = {5, 2, 8, 1, 9, 3};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Copy the array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);

        // Print the copied array
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(numbers));

        // Sort the array in descending order
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // Print the sorted array in descending order
        System.out.println("Sorted Array (Descending): " + Arrays.toString(numbers));

        // Search for an element in the array (binary search)
        int searchElement = 8;
        int index = Arrays.binarySearch(numbers, searchElement);
        if (index >= 0) {
            System.out.println(searchElement + " found at index " + index);
        } else {
            System.out.println(searchElement + " not found in the array");
        }

        // Fill the array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 42);

        // Print the filled array
        System.out.println("Filled Array: " + Arrays.toString(filledArray));
    }
}

