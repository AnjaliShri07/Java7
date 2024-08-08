package com.java7.programs.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapString
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the 1st String");
		String s1 = br.readLine();
		int length =s1.length();
		
		System.out.println("Enter the 2nd String");
		String s2 = br.readLine();
		
		
		System.out.println("-----------------------------------");
		System.out.println("String before Swapping : ");
		System.out.println("1st String is : " + s1);
		System.out.println("2nd String is : " + s2);
		
		//swapping Process begin
		s1 = s1+ s2;
		s2 = s1.substring(0, length);
		s1 = s1.substring(length);
		
		System.out.println("----------------------------------");
		System.out.println("String After Swapping : ");
		System.out.println("1st String : " + s1);
		System.out.println("2nd String is : " + s2);

	}

}
