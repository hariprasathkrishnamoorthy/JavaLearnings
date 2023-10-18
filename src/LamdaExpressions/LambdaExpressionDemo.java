package LamdaExpressions;

// Functional interface with a single abstract method
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        // Lambda expression for addition
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + operate(10, 5, addition));

        // Lambda expression for subtraction
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + operate(10, 5, subtraction));

        // Lambda expression for multiplication
        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + operate(10, 5, multiplication));

        // Lambda expression for division
        MathOperation division = (a, b) -> {
            if (b == 0) {
                return 0; // Handle division by zero
            }
            return a / b;
        };
        System.out.println("Division: " + operate(10, 0, division)); // Handling division by zero


    }

    // Method to perform a math operation using a lambda expression
    public static int operate(int a, int b, MathOperation operation)
    {
        return operation.operate(a, b);
    }
}

