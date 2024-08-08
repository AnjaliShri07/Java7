package com.java7.programs.String;

public class Reverse {

	public static void main(String[] args) {
		String str = "this is reverse program", empty = "";
		int i=str.length()-1;
		while(i >= 0)
		//for(int i = str.length()-1; i >= 0; i--)
		{
			empty = empty + str.charAt(i);
			i--;
		}
		System.out.println("Reverse String is : " + empty);
	}
}

/*public class Reverse
{
	static String reverse(String str)
	{
		if((str == null) || (str.length() <= 1))
		{
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
	public static void main(String[] args)
	{
		String s1 ="hellojava";
		String s2 = reverse(s1);
		System.out.println(s1 + " Reverse  " + s2);
	}
}
*/