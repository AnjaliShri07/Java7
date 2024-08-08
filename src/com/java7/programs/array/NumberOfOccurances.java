package com.java7.programs.array;

import java.util.Scanner;

public class NumberOfOccurances
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements you want in array : ");
		int num = sc.nextInt();
		int a[] = new int[num];
		System.out.println("Print all elements : ");
		for(int i= 0; i < num; i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println("Enter the element of which you want to count of occurance : ");
		int x = sc.nextInt();
		for(int i=0; i< num; i++)
		{
			if(a[i] == x)
			{
				count++;
			}
		}																						
		System.out.println("Number of occurances : " + count);
	}
}
