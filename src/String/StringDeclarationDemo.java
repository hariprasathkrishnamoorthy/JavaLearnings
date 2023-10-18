package String;

public class StringDeclarationDemo {

    public static void main(String[] args) {
        // Using the String Literal
        String str1 = "Hello, World!";
        System.out.println("Using String Literal: " + str1);

        // Using the new Keyword
        String str2 = new String("Hello, World!");
        System.out.println("Using new Keyword: " + str2);

        // Using Character Array
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        String str3 = new String(charArray);
        System.out.println("Using Character Array: " + str3);

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", World!");
        String str4 = stringBuilder.toString();
        System.out.println("Using StringBuilder: " + str4);

        // Using String Concatenation
        String str5 = "Hello" + ", " + "World!";
        System.out.println("Using String Concatenation: " + str5);

        // Using String.format()
        String str6 = String.format("Hello, %s!", "World");
        System.out.println("Using String.format(): " + str6);
    }

}
