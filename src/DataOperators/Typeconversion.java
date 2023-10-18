package DataOperators;

public class Typeconversion {
    public static void main(String[] args) {
        int smallNumber = 10;
        long largeNumber = smallNumber; // Implicit conversion from int to long

        double bigValue = 3.14;
        int intValue = (int) bigValue; // Explicit conversion (casting) from double to int

        double number1 = 3.9;
        double result1 = Math.floor(number1);

        double number2 = 3.1;
        double result2 = Math.ceil(number2);


        System.out.println("Implicit: " + largeNumber);
        System.out.println("Explicit: " + intValue);
        System.out.println("Implicit: " + result1);
        System.out.println("Explicit: " + result2);

    }
}



