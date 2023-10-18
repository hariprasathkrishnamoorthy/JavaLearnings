package String;

public class StringPoolandHeap {
    public static void main(String[] args) {

        String str1 = "Hello, World!"; // Created in the string pool
        String str2 = "Hello, World!"; // Reuses str1 from the string pool

        String str3 = new String("Hello, World!"); // Created in the heap memory
        String str4 = new String("Hello, World!"); // Created in the heap memory

        System.out.println(str1 == str2); // true (they reference the same string in the pool)
        System.out.println(str1 == str3); // false (str1 is in the pool, str3 is in the heap)
        System.out.println(str3 == str4); // false (str3 is in the heap, str4 is in the heap)
        System.out.println(str3 == str3);

    }
}
