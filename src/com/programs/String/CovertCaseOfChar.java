package com.programs.String;

import java.util.Scanner;


public class CovertCaseOfChar 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character");
		char ch;
		ch = sc.next().charAt(0);
		if(ch >= 65 && ch <= 90)
		{
			ch = (char)((int)ch + 32);
			System.out.println("Upper case to Lower case: " + ch);
		} 
		else if(ch >= 97 && ch <= 122)
		{
			ch = (char)((int)ch - 32);
			System.out.println("Lower case to Upper case: " + ch);
		}
	}
}
