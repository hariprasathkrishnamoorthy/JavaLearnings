package DataOperators;

public class BitwiseLeftShiftExample {
    public static void main(String[] args) {
        int num = 5;  // Binary: 0101
        int shifted = num << 2;  // Left shift by 2 positions

        System.out.println("Result of num << 2: " + shifted);  // Output: 20 (Binary: 10100)   Equalent to multiply number by 2 power n (n=no of positions)
    }
}
