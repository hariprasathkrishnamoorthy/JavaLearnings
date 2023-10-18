package String;

public class StringComparisonDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";
        String str4 = "Hello";

        // Using equals() method for case-sensitive comparison
        boolean isEqual1 = str1.equals(str2);
        System.out.println("Using equals() method (case-sensitive): str1 equals str2? " + isEqual1);

        // Using equalsIgnoreCase() method for case-insensitive comparison
        boolean isEqual2 = str1.equalsIgnoreCase(str3);
        System.out.println("Using equalsIgnoreCase() method (case-insensitive): str1 equals str3? " + isEqual2);

        // Using compareTo() method for lexicographic comparison
        int result = str1.compareTo(str2);
        System.out.println("Using compareTo() method: str1 compared to str2: " + result);

        // Using compareToIgnoreCase() method for case-insensitive lexicographic comparison
        int result2 = str1.compareToIgnoreCase(str3);
        System.out.println("Using compareToIgnoreCase() method: str1 compared to str3 (case-insensitive): " + result2);

        // Using == operator to compare references (not content)
        boolean isSameReference = (str1 == str2);
        System.out.println("Using == operator: str1 and str2 reference the same object? " + isSameReference);

        isSameReference = (str1 == str4);
        System.out.println("Using == operator: str1 and str4 reference the same object? " + isSameReference);
    }
}
