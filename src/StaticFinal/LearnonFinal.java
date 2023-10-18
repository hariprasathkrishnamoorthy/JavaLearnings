package StaticFinal;

public class LearnonFinal {

    public static void main(String[] args) {
        final int num1 = 10;
        int num2 = 5;
         Integer x= 10;

        final int[] numbers = {1, 2, 3, 4, 5};

        // You can't reassign 'numbers' to a different array
        // This will result in a compilation error
        // numbers = new int[]{6, 7, 8};

        // But you can modify the elements of the 'numbers' array
        numbers[0] = 10;
        numbers[1] = 20;


        //with method
        //with class


    }

}
