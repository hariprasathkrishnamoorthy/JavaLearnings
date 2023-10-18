package ExceptionHandling;


import java.io.*;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            //Division by zero exception
            int result = divide(10, 0);

            // ArrayIndexOutOfBoundsException
            //int[] arr = new int[5];
            //int value = arr[10];

            // NullPointerException
            String str = null;
            int length = str.length();

            // IOException
            FileReader fileReader = new FileReader("nonexistentfile.txt");

            // Custom exception
            int age = -1;
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative");
            }
        }



        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch (NegativeAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block is executed.");
        }
    }

    // Custom exception class
    static class NegativeAgeException extends Exception {
        public NegativeAgeException(String message) {
            super(message);
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
