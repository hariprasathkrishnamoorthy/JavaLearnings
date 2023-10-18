package String;

public class StringAndStringBuilderMutationDemo {
    public static void main(String[] args) {
        // Demonstrating String Mutation
        String originalString = "Hello, ";
        String mutatedString = originalString + "World!";

        // Printing the original and mutated strings
        System.out.println("String Mutation:");
        System.out.println("Original String: " + originalString);
        System.out.println("Mutated String: " + mutatedString);
        System.out.println();

        // Demonstrating StringBuilder Mutation
        StringBuilder originalBuilder = new StringBuilder("Hello, ");
        StringBuilder mutatedBuilder = originalBuilder.append("World!");

        // Printing the original and mutated StringBuilders
        System.out.println("StringBuilder Mutation:");
        System.out.println("Original StringBuilder: " + originalBuilder);
        System.out.println("Mutated StringBuilder: " + mutatedBuilder);
    }
}

