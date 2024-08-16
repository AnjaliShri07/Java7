package com.java7.programs.String;

import java.util.HashMap;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println("Index of first non-repeating character in s1: " + firstUniqChar(s1));
        System.out.println("Index of first non-repeating character in s2: " + firstUniqChar(s2));
        System.out.println("Index of first non-repeating character in s3: " + firstUniqChar(s3));
    }

    public static int firstUniqChar(String s) {
        // Frequency map to count occurrences of each character
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Populate the frequency map
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // No non-repeating character found
        return -1;
    }
}
