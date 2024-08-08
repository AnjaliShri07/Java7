package com.java7.programs.hackerRank;

import java.util.Scanner;

class JavaRegex {
	 public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class UsernameValidator {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(JavaRegex.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}


/*
For example:

Username	Validity
INVALID; Username length < 8 characters
VALID
VALID
INVALID; Username begins with non-alphabetic character
INVALID; '?' character not allowed
*/

/*
Sample Input 0

8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
Sample Output 0

Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid
*/