package com.java7.programs.array;

/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of
the integer. The digits are ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].*/

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {

        int n = digits.length;

        // Start from the last digit
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, simply add one and return the result
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Set the current digit to 0 and continue with the carry
            digits[i] = 0;
        }

        // If all digits are 9, we need to create a new array with an additional digit
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;

    }
    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9};
        int[] digits4 = {1, 2, 9};

        int[] result1 = plusOne(digits1);
        int[] result2 = plusOne(digits2);
        int[] result3 = plusOne(digits3);

        System.out.println("Result 1: " + Arrays.toString(result1));
        System.out.println("Result 2: " + Arrays.toString(result2));
        System.out.println("Result 3: " + Arrays.toString(result3));
        System.out.println("Result 4: "+ Arrays.toString(plusOne(digits4)));
    }
}


