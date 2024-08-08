package com.java7.programs.array;

import java.util.Scanner;

public class LargestAndSmallest
{
	public static void main(String[] args)
	{
		int i, big, small;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of element you want in array : ");
		int num = sc.nextInt();
		
		int a[] = new int[num];
		System.out.println("Enter elements of array : ");
		for(i=0; i< num; i++)
		{
			a[i] = sc.nextInt();
		}
		big =a[0];
		for(i=1; i<num; i++)
		{
			if(big < a[i])
			{
				big = a[i];
			}
		}
		System.out.println("Largest Number : " + big);
		small = a[0];
		for(i=1; i<num; i++)
		{
			if(small > a[i])
			{
				small = a[i];
			}
		}
		System.out.println("Smallest Number : " + small);
	}
}