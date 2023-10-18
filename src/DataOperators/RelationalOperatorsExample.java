package DataOperators;

public class RelationalOperatorsExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        boolean isEqual = num1 == num2;
        boolean isNotEqual = num1 != num2;
        boolean isGreaterThan = num1 > num2;
        boolean isLessThan = num1 < num2;
        boolean isGreaterOrEqual = num1 >= num2;
        boolean isLessOrEqual = num1 <= num2;

        System.out.println("Equal: " + isEqual);
        System.out.println("Not Equal: " + isNotEqual);
        System.out.println("Greater Than: " + isGreaterThan);
        System.out.println("Less Than: " + isLessThan);
        System.out.println("Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Less or Equal: " + isLessOrEqual);
    }
}
