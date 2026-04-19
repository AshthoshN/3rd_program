package strings;

/*
3a. Develop a java program for performing various string operations with different string handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations,
String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting,
Validate Email with contains() and startsWith() and endsWith()
*/

import java.util.*;

public class threea {

    public static void main(String[] args) {

        // String Creation
        String str1 = "Hello";
        String str2 = new String("World");

        // Basic Operation (concatenation)
        System.out.println("Combined: " + str1 + " " + str2);

        // Length and Character Access
        System.out.println("Length: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // String Comparison
        System.out.println("Equals: " + str1.equals("hello"));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("hello"));

        // String Searching
        System.out.println("Contains 'He': " + str1.contains("He"));
        System.out.println("Index of 'l': " + str1.indexOf('l'));

        // Substring Operation
        System.out.println("Substring (1,4): " + str1.substring(1, 4));

        // String Modification
        System.out.println("Replace H with J: " + str1.replace("H", "J"));

        // Whitespace Handling
        String temp = "   Java Programming   ";
        System.out.println("Before trim: '" + temp + "'");
        System.out.println("After trim: '" + temp.trim() + "'");

        // String Concatenation
        System.out.println("Using concat(): " + str1.concat(str2));

        // String Splitting
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" - Middle");
        sb.append(" - End");
        System.out.println("StringBuilder: " + sb);

        // String Formatting
        System.out.println(String.format("Name: %s, Age: %d", "John", 20));

        // Email Validation
        String email = "example@gmail.com";
        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}