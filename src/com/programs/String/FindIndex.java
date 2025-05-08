package com.programs.String;

public class FindIndex {
	public static void main(String[] args) {
		String str = "Hi How are you";
		String[] s = str.split(" ");
		// String[] s= {"hi","how","are", "you"};
		String keyword = "you";
		for (int i = 0; i < s.length; i++) {
			if (s[i].equalsIgnoreCase(keyword)) {
				System.out.println("keyword is in index : " + i);
			}
		}
	}

}
