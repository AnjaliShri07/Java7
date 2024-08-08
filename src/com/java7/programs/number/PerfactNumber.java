package com.java7.programs.number;

import java.util.Scanner;

public class PerfactNumber
{

	public static void main(String[] args)
	{
		//1+ 2 + 3 = 6
		//1 + 2 + 4 + 7 + 14 = 28
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int sum =0;
		for(int i = 1; i <= num/2; i++)
		{
			if(num % i == 0)
			{
				sum+=i;
			}
		}
		if(num == sum)
		{
			System.out.println(num + " is perfact number");
		}
		else
		{
			System.out.println( num+ " is not perfact number");
		}
	}
}
