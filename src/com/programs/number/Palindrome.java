package com.programs.number;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args)
	{
		int num,rem, rev=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		int temp = num;
		while(num != 0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if(rev == temp)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}
