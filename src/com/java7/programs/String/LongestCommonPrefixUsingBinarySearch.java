package com.java7.programs.String;

public class LongestCommonPrefixUsingBinarySearch {
    public static void main(String[] args) {
        String[] arr = {"mint", "mini", "mineral"};

        // Find the length of the shortest string
        int length = Integer.MAX_VALUE;
        for (String s : arr) {
            length = Math.min(length, s.length());
        }

        int low = 0;
        int high = length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // Check if the substring from index 0 to mid is a prefix of all strings
            boolean allEqual = true;
            for (String s : arr) {
                if (!s.substring(0, mid + 1).equals(arr[0].substring(0, mid + 1))) {
                    allEqual = false;
                    break;
                }
            }
            if (allEqual)
                low = mid + 1;
            else
                high = mid - 1;
        }

        // Extract the longest common prefix found
        String result = arr[0].substring(0, low);
        System.out.println("Longest common prefix: " + result);
    }
}
