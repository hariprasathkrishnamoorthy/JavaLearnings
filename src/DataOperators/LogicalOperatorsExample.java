package DataOperators;

public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;

        boolean andResult = isTrue && isFalse;
        boolean orResult =  isTrue || isFalse;
        boolean notResult = !isTrue;

        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("NOT Result: " + notResult);
    }
}
