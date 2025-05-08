package com.programs.number;

import java.util.Scanner;

/*12 = 1*1*1 + 2*2*2- not Armstrong */

public class Armstrong
{
	public static void main(String[] args)
	{
		int num, rem, rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		int temp = num;
		while(num != 0)
		{
			rem = num % 10;
			rev = rev + (rem * rem * rem);
			num = num / 10;
		}
		if(rev == temp)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}

	}

}
