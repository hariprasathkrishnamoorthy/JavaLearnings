package Arrays;

public class CopyArrayExample {
    public static void main(String[] args) {
        // Initialize an integer array
        int[] sourceArray = {1, 2, 3, 4, 5};

        // Create a new array and copy elements from the source array
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }

        // Print the copied array
        for (int element : targetArray) {
            System.out.println(element);
        }
    }
}

