package com.programs.String;

import java.util.Scanner;

public class RemoveVowel
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string ");
		String s = sc.nextLine();
		String s2 = s.replaceAll("[aeiouAEIOU]", "");
		
		System.out.println(s2);
	}
}

