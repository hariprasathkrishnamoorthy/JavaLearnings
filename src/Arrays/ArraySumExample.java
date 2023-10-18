package Arrays;

public class ArraySumExample {
    public static void main(String[] args) {
        // Initialize an integer array
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
             numbers[i]=i+1;

        }

        // numbers array will have {1,2,3,4,5};

        // Calculate the sum of array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}

