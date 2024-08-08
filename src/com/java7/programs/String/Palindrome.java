package com.java7.programs.String;

public class Palindrome {
	
	public static boolean check(String s)
	{
		int i=0;
		while(i < s.length()/2)
		//for(int i = 0; i < s.length()/2; i++)
		{
			if(s.charAt(i) != s.charAt(s.length()-i-1))
			{
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		String string = new String("malayalam");
		if(check(string))
		{
			System.out.println(string+" is Palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
	}
}
