package com.programs.String;

import java.util.*;

public class PossibleSubstrings {
    public static Set<String> getAllSubstrings(String str) {
        Set<String> substrings = new HashSet<>();

        // Loop through all possible starting points
        for (int i = 0; i < str.length(); i++) {
            // Loop through all possible ending points
            for (int j = i + 1; j <= str.length(); j++) {
                // Extract the substring
                substrings.add(str.substring(i, j));
            }
        }

        return substrings;
    }
    public static void main(String[] args) {
        String input = "abc";
        Set<String> substrings = getAllSubstrings(input);

        // Print all substrings
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
