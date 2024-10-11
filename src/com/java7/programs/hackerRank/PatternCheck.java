package com.java7.programs.hackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternCheck {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	try {
                Pattern.compile(pattern);
                System.out.println("ValId");
            } catch (PatternSyntaxException e) {
                System.out.println("InvalId");
            }
            testCases--;
		}

	}

}
/*Sample Input

3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
Sample Output

ValId
InvalId
InvalId
*/