package com.java7.programs.String;

public class ReverseWords {
    public static String reverseWords(String s) {
        // Trim the string to remove any leading or trailing spaces
        s = s.trim();

        // Split the string by one or more spaces using a regular expression
        String[] words = s.split("\\s+");

        // Use StringBuilder to efficiently concatenate strings
        StringBuilder reversed = new StringBuilder();

        // Iterate over the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            // Append each word to the result
            reversed.append(words[i]);

            // Append a space if it's not the last word
            if (i > 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "  the sky is blue  ";
        String result = reverseWords(input);
        System.out.println("Reversed: '" + result + "'");
    }
}
