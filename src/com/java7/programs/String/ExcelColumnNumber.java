package com.java7.programs.String;

public class ExcelColumnNumber {
    // Method to convert column label to corresponding number
    public static int columnToNumber(String column) {
        int result = 0;

        // Iterate over each character in the string
        for (int i = 0; i < column.length(); i++) {
            // Get the value of each character ('A' is 1, 'B' is 2, ..., 'Z' is 26)
            result = result * 26 + (column.charAt(i) - 'A' + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("A = " + columnToNumber("A"));   // Output: 1
        System.out.println("Z = " + columnToNumber("Z"));   // Output: 26
        System.out.println("AA = " + columnToNumber("AA")); // Output: 27
        System.out.println("AZ = " + columnToNumber("AZ")); // Output: 52
        System.out.println("BA = " + columnToNumber("BA")); // Output: 53
        System.out.println("ZZ = " + columnToNumber("ZZ")); // Output: 702
    }
}
/*Explanation:
Base-26 Calculation:
We treat each letter as a digit in a Base-26 system, where A = 1, B = 2, ..., Z = 26.
The logic behind the conversion:
A = 1
Z = 26
AA = 27 (since it's 1*26 + 1)
AZ = 52 (since it's 1*26 + 26)
BA = 53 (since it's 2*26 + 1), and so on.
Formula:
For each character in the string, we multiply the current result by 26 and add the numeric value of the character (column.charAt(i) - 'A' + 1).*/

