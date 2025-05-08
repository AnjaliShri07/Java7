package com.programs.array.smallestLargest;

import java.util.Scanner;

public class SecondLargest
{
	static int secondLargest(int[] input)
	{
		int firstL,  secondL;
		if (input[0] > input[1])
		{
			firstL = input[0];
			secondL = input[1];
		}
		else
		{
			firstL = input[1];
			secondL = input[0];
		}
		for(int i=2; i< input.length; i++)
		{
			if(input[i] > firstL)
			{
				firstL = input[i];
				secondL = firstL;
			}
			else if(input[i] < firstL && input[i] > secondL)
					secondL = input[i];
	
		}
		return secondL;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements you want in array : ");
		int num = sc.nextInt();
		int a[] = new int[num];
		System.out.println("Print all elements : ");
		for(int i= 0; i < num; i++)
		{
			a[i]= sc.nextInt();
		}
		//int a [] = {1,3, 4, 5};
		int b = secondLargest(a);
		System.out.println("Second largest: " + b);
	}
}