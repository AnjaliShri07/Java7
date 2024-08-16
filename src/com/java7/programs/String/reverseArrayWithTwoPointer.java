package com.java7.programs.String;

import java.util.Arrays;

public class reverseArrayWithTwoPointer {
    public static void main(String[] args) {
        // Input character array
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        // Reverse the array
        reverseArray(s);

        // Print the reversed array
        System.out.println(Arrays.toString(s));
    }

    public static void reverseArray(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }
}
