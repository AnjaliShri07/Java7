package com.programs.hackerRank;

import java.util.Scanner;

class JavaRegex {
	 public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class UserNameValidator {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(JavaRegex.regularExpression)) {
                System.out.println("ValId");
            } else {
                System.out.println("InvalId");
            }           
        }
    }
}


/*
For example:

UserName	ValIdity
INVALId; UserName length < 8 characters
VALId
VALId
INVALId; UserName begins with non-alphabetic character
INVALId; '?' character not allowed
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

InvalId
ValId
ValId
InvalId
InvalId
ValId
InvalId
InvalId
*/