package DataOperators;

public class UnboxingExample {
    public static void main(String[] args) {
        // Boxing: Creating Integer objects
        Integer num1 = Integer.valueOf(42);
        Integer num2 = Integer.valueOf(73);



        // Unboxing: Converting Integer to int
        int result = num1 + num2; // Unboxing

        System.out.println("Unboxing Example:");
        System.out.println("Result: " + result);

    }
}
