package String;

public class StringMethodsDemo {
    public static void main(String[] args) {
        // Demonstrating toCharArray() method
        String originalString = "Hello, World!";
        char[] charArray = originalString.toCharArray();
        System.out.println("toCharArray() Method:");

        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        // Demonstrating substring(fIndex, lIndex) method
        String substringExample = "Substring Example";
        String subString = substringExample.substring(9, 16);   //start at specified index (count from 0) ends before specified end index
        System.out.println("Original String: " + substringExample);
        System.out.println("Substring: " + subString + "\n");

        // Demonstrating replace(a, x) method
        String replaceExample = "Replace Example";
        String replacedString = replaceExample.replace("Example", "Demo");
        System.out.println("replace(a, x) Method:");
        System.out.println("Original String: " + replaceExample);
        System.out.println("Replaced String: " + replacedString);
    }
}

