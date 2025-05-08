package com.demoPrograms;

import java.util.Scanner;

public class OnlyAlphbetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String str= sc.nextLine();
      Boolean check = OnlyAlphbetic.isAlphaNumeric(str);
     if(check){
        System.out.print("True");
     }else{
        System.out.print("False");
     }

	}
	public static boolean isAlphaNumeric(String s) {
	    if (isEmpty(s)) {
	          return false;
	      }
		  Boolean c = s != null && s.matches("^[a-zA-Z0-9]*$");
		return c;
	}

private static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}
}
