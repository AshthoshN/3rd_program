package strings;

/*
3c. String Exercise Programs

Q6. Capitalize first letter of each word using capitalizeWords()
Q7. Truncate string and add ellipsis using truncate()
Q8. Check if string is numeric using isNumeric()
Q9. Generate random string using generateRandomString()
Q10. Count number of words using countWords()
*/

import java.util.Random;

public class threec {

    // Q6: Capitalize words
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }
        return result.trim();
    }

    // Q7: Truncate string
    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }

    // Q8: Check numeric
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    // Q9: Generate random string
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        String result = "";
        for (int i = 0; i < length; i++) {
            result += chars.charAt(rand.nextInt(chars.length()));
        }
        return result;
    }

    // Q10: Count words
    public static int countWords(String str) {
        if (str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {

        // Testing functions
        System.out.println("Capitalized: " + capitalizeWords("java is fun"));
        System.out.println("Truncated: " + truncate("HelloWorld", 5));
        System.out.println("Is Numeric: " + isNumeric("12345"));
        System.out.println("Random String: " + generateRandomString(6));
        System.out.println("Word Count: " + countWords("Java is very powerful"));
    }
}