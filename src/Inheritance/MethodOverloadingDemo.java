package Inheritance;

public class MethodOverloadingDemo {
    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Method with a String parameter
    public String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

        // Call the add method with two integers
        int sum1 = demo.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        // Call the add method with three integers
        int sum2 = demo.add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);

        // Call the add method with two doubles
        double sum3 = demo.add(3, 2.7);
        System.out.println("Sum of two doubles: " + sum3);

        // Call the add method with two strings
        String concatStr = demo.add("Hello, ", "world!");
        System.out.println("Concatenated string: " + concatStr);
    }
}
