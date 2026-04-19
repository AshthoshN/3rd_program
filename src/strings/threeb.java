package strings;

/*
3b. String Exercise Programs

Q1. Check if a string is null or contains only whitespace using isNullOrEmpty()
Q2. Count occurrences of a substring using countOccurrences()
Q3. Reverse a string using reverseString()
Q4. Check palindrome ignoring case and punctuation using isPalindrome()
Q5. Remove all whitespace using removeWhitespace()
*/

public class threeb {

    // Q1: Check null or empty
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    // Q2: Count substring occurrences
    public static int countOccurrences(String main, String sub) {
        int count = 0, index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    // Q3: Reverse string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Q4: Check palindrome
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    // Q5: Remove whitespace
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {

        // Testing functions
        System.out.println("Is Null or Empty: " + isNullOrEmpty("   "));
        System.out.println("Occurrences: " + countOccurrences("hello hello", "lo"));
        System.out.println("Reverse: " + reverseString("Java"));
        System.out.println("Palindrome: " + isPalindrome("Madam"));
        System.out.println("Without spaces: " + removeWhitespace("J a v a"));
    }
}