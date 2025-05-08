package com.demoPrograms;

import java.util.Scanner;

/*You just need to take two strings as an input and check later string is the suffix of the former one. 
 * If yes, return a string 'True' else return 'False'.
*/
public class StringWithSuffix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String str= sc.nextLine();
		 String s = sc.next();
		
		 System.out.print(StringWithSuffix.countMatches(str, s));

	}
	
	public static String countMatches(String str, String sub) {
	      if (isEmpty(str) || isEmpty(sub)) {
	          return "False";
	      }
	      if (str.length() == sub.length()) {
	    	  return "True";
	    	} else if (str.length() > sub.length()) {
	    		if((str.substring(str.length() - sub.length())).equals(sub) ) {
	    			return "True";
	    		}else {
	    			return "False";
	    		}
	    	} else {
	    		return "False";
	    	}
	 	  }

	private static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}

}
