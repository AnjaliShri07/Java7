package com.java7.programs.array.ArraysSum;

public class SumOfArray
{

	public static void main(String[] args)
	{
		int sum=0;
		int[] x ={1, 2, 3, 4, 5 ,6};
		for(int i=0; i < x.length; i++)
		{
			sum+=x[i];
		}
		System.out.println(sum);
	}

}