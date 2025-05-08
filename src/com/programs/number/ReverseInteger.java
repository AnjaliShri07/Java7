package com.programs.number;

public class ReverseInteger {
    public static int reverse(int x) {
        int reversed = 0;
        int original = x;

        // Determine the sign of the input
        boolean isNegative = (x < 0);

        // Work with the absolute value of x
        if (isNegative) {
            x = -x;
        }

        // Reverse the digits
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before updating the reversed value
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }

        // Restore the sign
        if (isNegative) {
            reversed = -reversed;
        }

        return reversed;
    }
    public static void main(String[] args) {

    }
}
