package com.java7.programs.number;

/*Find the weight of given String.
        (A-Z/a-z) we have 26 alphabetic, consIder the position of a-z alphabets as 1-26. Based on that find the weight of
the given String.
        Ex:
Given String: Apple
Output: 1+16+16+12+5 = 50*/
public class StringWeight {
    public static int getStringWeight(String input) {
        int weight = 0;

        // Convert the string to lowercase to handle case insensitivity
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter between 'a' and 'z'
            if (ch >= 'a' && ch <= 'z') {
                weight += (ch - 'a' + 1);  // 'a' is at position 1, 'b' at 2, ..., 'z' at 26
            }
        }
        return weight;
    }

    public static void main(String[] args) {
        String input = "Apple";
        int result = getStringWeight(input);
        System.out.println("The weight of the string \"" + input + "\" is: " + result);
    }
}

/*Explanation:
The string is first converted to lowercase to handle both uppercase and lowercase letters uniformly.
The loop checks each character to see if it falls between 'a' and 'z'.
The weight of each character is calculated by subtracting 'a' from the current character and adding 1 (because 'a' should map to 1, 'b' to 2, etc.).
The total weight is summed and printed.*/
