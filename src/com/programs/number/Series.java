package com.programs.number;
//write a program to print series->1,2,2,3,4,6,9,14,22,35,56....
public class Series
{
	public static void main(String[] args)
	{
		int a=1;
		int b=2;
		int c=0;
		System.out.print(a +",");
		System.out.print(b +",");
		for(int i=3; i< 15; i++)
		{
			 c =a+b-1;
			System.out.print(c +",");
			a=b;
			b=c;
		}
	}
}
