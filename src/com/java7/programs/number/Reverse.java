package com.java7.programs.number;

import java.util.Scanner;

public class Reverse
{

	public static void main(String[] args)
	{
		int num,rem, rev=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		while(num != 0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reverse Number is : " + rev);
	}

}
