package com.java7.programs.String;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty())
            return "";

        int n = s.length();

        // dp[i][j] will be false if
        // substring str[i..j] is not palindrome.
        // Else dp[i][j] will be true
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLength = 1;

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check for two character palindromes
        // Check for sub-string of length 2.
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for palindromes of length 3 or more
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = length;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String input = "babad";
        String result = longestPalindrome(input);
        System.out.println("Longest Palindromic Substring: " + result);

        input = "cbbd";
        result = longestPalindrome(input);

        System.out.println("Longest Palindromic Substring: " + result);

        String str = "forgeeksskeegfor";
        result = longestPalindrome(str);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}
