package com.programs.String.longestCommonPrefix;

public class LongestCommonPrefixUsingBinarySearch {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";  // No strings in the array, return empty string
        }
        // Step 1: Find the minimum length of the strings
        int minLength = findMinLength(strs);

        // Step 2: Perform binary search for the longest common prefix
        int low = 0;
        int high = minLength;

        while (low <= high) {
            int middle = (low + high) / 2;

            // Step 3: Check if all strings have the same prefix of this length
            if (isCommonPrefix(strs, middle)) {
                // If true, try a longer prefix (increase the lower bound)
                low = middle + 1;
            } else {
                // If false, try a shorter prefix (decrease the upper bound)
                high = middle - 1;
            }
        }

        // Step 4: Return the longest common prefix found
        return strs[0].substring(0, (low + high) / 2);
    }

    // Helper function to find the minimum length of the strings in the array
    private static int findMinLength(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }
        return minLength;
    }

    // Helper function to check if all strings share the same prefix of given length
    private static boolean isCommonPrefix(String[] strs, int length) {
        String prefix = strs[0].substring(0, length);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(prefix)) {
                return false;  // If any string does not start with the prefix, return false
            }
        }
        return true;  // All strings share the same prefix
    }

    public static void main(String[] args) {
        String[] strs = {"mint", "mini", "mineral"};

        System.out.println("Longest common prefix: " + longestCommonPrefix(strs));
    }
}
