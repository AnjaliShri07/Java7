package com.programs.array.smallestLargest;

import java.util.Arrays;

public class SmallestSecondSmallestElementInArray {
	private static void getSmallestAndSecondSmallestElement(int[] inputArray)
	{
		int smallest = inputArray[0];
		int secondSmallest = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) 
		{
			if (inputArray[i] < smallest)
			{
				smallest = inputArray[i];
				secondSmallest = smallest;				
			}
			else if (inputArray[i] > smallest && inputArray[i] < secondSmallest)
			{
				secondSmallest = inputArray[i];
			}
		}
		System.out.println("Input Array : "+ Arrays.toString(inputArray));
		System.out.println("Smallest Element : "+ smallest);
		System.out.println("Second Smallest Element : "+ secondSmallest);
	}
	public static void main(String[] args)
	{
		getSmallestAndSecondSmallestElement(new int[] {17, 11, 23, 64, 41, 88, 35});
		System.out.println("===============================");
		getSmallestAndSecondSmallestElement(new int[] {-9, 3, 36, -25, -9, 71, 0});
		System.out.println("===============================");
		getSmallestAndSecondSmallestElement(new int[] {21, 21, -18, -4, -11, 85, 7});
	}
}
