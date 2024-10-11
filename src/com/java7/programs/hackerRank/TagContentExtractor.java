package com.java7.programs.hackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          			

			boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }
			
			testCases--;
		}

	}

}


/*

<(.+)>
matches HTML start tags. The parentheses save the contents insIde the brackets into Group #1.

([^<]+)
matches all the text in between the HTML start and end tags. 
We place a special restriction on the text in that it can't have the "<" symbol. 
The characters insIde the parenthesis are saved into Group #2.

</\\1>
is to match the HTML end brace that corresponds to our previous start brace. 
The \1 is here to match all text from Group #1.

*/

/*
Sample Input

4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>

Sample Output

Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush

*/