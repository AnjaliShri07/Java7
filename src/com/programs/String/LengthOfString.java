package com.programs.String;

public class LengthOfString 
{
	static int i;
	static int length(String s)
	{
		try
		{
			for(i = 0; i >= 0; i++)
				s.charAt(i);
		} 
		catch (Exception e)
		{
			System.out.print("length is : ");
		}
		return i;
	}
	public static void main(String[] args)
	{
		String str= "string";
		System.out.println("Original String is : " + str);
		System.out.println(length(str));
	}
}


