package com.demoPrograms;

import java.util.Scanner;

/*You just need to take two strings as an input and count how many times later string comes in the former one. 
 * Return the count.
*/
public class CountChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String str= sc.nextLine();
		 String s = sc.next();
		
		 System.out.print(CountChar.countMatches(str, s));
	}
	
	public static int countMatches(String str, String sub) {
	      if (isEmpty(str) || isEmpty(sub)) {
	          return 0;
	      }
	      int count = 0;
	      int idx = 0;
	      while ((idx = str.indexOf(sub, idx)) != -1) {
	          count++;
	          idx += sub.length();
	      }
	      return count;
	  }

	private static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}

}

