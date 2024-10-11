package com.java7.programs.String;

public class FindWordInString {
    public static int findFirstOccurrence(String haystack, String needle) {

        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";

        String haystack2 = "leetcode";
        String needle2 = "leeto";

        System.out.println(findFirstOccurrence(haystack1, needle1)); // Output: 0
        System.out.println(findFirstOccurrence(haystack2, needle2)); // Output: -1
    }

}
