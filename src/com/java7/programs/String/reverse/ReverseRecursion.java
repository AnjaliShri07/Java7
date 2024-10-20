package com.java7.programs.String.reverse;

public class ReverseRecursion {

	//Method which reverse a string
	private static String reverse(String str) {
		//Terminating condition
		if(str == null || str.length() <= 1) {
			return str;
		}														
		//Recursive function call
		return reverse(str.substring(1)) + str.charAt(0);
	}
	public static void main(String[] args) {
		String str = "Object abc";
		System.out.println(reverse(str));
	}

}
