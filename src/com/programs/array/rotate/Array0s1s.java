package com.programs.array.rotate;

import java.util.Arrays;

//A divIde-and-conquer algorithm
public class Array0s1s {
	private static void sortBinaryArray(int[] inputArray)
	{
		int left = 0;
		int right = inputArray.length-1;
		System.out.println("Input Array Before Sorting : "+Arrays.toString(inputArray));
		while (left < right)
		{
			if (inputArray[left] == 1)
			{
				//Swapping
				inputArray[right] = inputArray[right] + inputArray[left];
				inputArray[left] = inputArray[right] - inputArray[left];
				inputArray[right] = inputArray[right] - inputArray[left];
				right--;
			}
			else
			{
				left++;
			}
		}
		System.out.println("Input Array After Sorting Left sIde : "+Arrays.toString(inputArray));
	}
	public static void main(String[] args) 
	{
		sortBinaryArray(new int[] {1, 0, 1, 1, 0, 1, 0, 0});
		System.out.println("============================");
		sortBinaryArray(new int[] {1, 1, 1, 1, 0, 0, 0, 0});
		System.out.println("============================");
		sortBinaryArray(new int[] {1, 1, 0, 0, 1, 1, 0, 0});
	}
}
