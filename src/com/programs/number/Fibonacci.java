package com.programs.number;

public class Fibonacci
{

	public static void main(String[] args)
	{
		int i=0;
		int j=1;
		int k=0;
		System.out.print(i + ",");
		System.out.print(j + ",");
		for(int m=3; m <= 20; m++)
		{
			k = i + j;
			System.out.print(k + ",");
			i = j;
			j = k;
		}
	}
}
/*
 static int fibonacciNumber(int num)
 {
 	if(num == 1 || num == 2)
 	{
 		return 1;
 	}
 	return fibonacciNumber(num-1) + fibonacciNumber(num-2);
 } 
 public static void main(String[] args)
 {
 	for(int i=1; i<=10; i++)
 	{
 		System.out.println(fibonacciNumber(i) + " ");
 	}
 */
