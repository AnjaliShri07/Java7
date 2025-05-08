package com.programs.String;

public class Palindrome {
	
	public static boolean check(String s)
	{
		if(s.isEmpty())
			return true;

		// Normalize the string: convert to lowercase and remove non-alphanumeric characters
		String normalized = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int i=0;
		while(i < normalized.length()/2){
			if(normalized.charAt(i) != normalized.charAt(normalized.length()-i-1)){
				return false;
			}
			i++;
		}
		return true;

	}

	public static void main(String[] args) {
		String str1 = new String("malayalam");
		String str2 = "A man, a plan, a canal: Panama";
		String str3 = "0P";
		String str4 = "ab_a";  // true
		System.out.println(check(str1));
		System.out.println(check(str2));
		System.out.println(check(str3));
		System.out.println(check(str4));
	}
}
