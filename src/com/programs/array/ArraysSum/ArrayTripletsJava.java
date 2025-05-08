package com.programs.array.ArraysSum;

import java.util.Arrays;
import java.util.HashSet;

//Write a Java program to find array triplets such that sum of first two elements equals the third element?
public class ArrayTripletsJava {
	private static void getArrayTriplets(int[] inputArray)
	{
		System.out.println("Input Array : "+Arrays.toString(inputArray));
		//Creating HashSet called elementSet
		HashSet<Integer> elementSet = new HashSet<>();
		//Adding all elements into elementSet
		
		System.out.println("Array triplets with sum of first two elements equals third :");
		for (int i = 0; i < inputArray.length-1; i++) 
		{
			for (int j = i+1; j < inputArray.length; j++) 
			{
				//Checking whether elementSet contains sum of any two elements
				if (elementSet.contains(inputArray[i]+inputArray[j])) 
				{
					System.out.println("["+inputArray[i]+", "+inputArray[j]+", "+(inputArray[i]+inputArray[j])+"]");
				}else {
					elementSet.add(inputArray[j]);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		getArrayTriplets(new int[] {21, 13, 47, 61, 34, 40, 55, 71, 87});   //[21, 13, 34]
																		    //[21, 34, 55]
																			//[21, 40, 61]
																			//[13, 34, 47]
																			//[47, 40, 87]
		System.out.println("===========================================");
		getArrayTriplets(new int[] {-1, 3, -2, 1, -4, 0, 5, 2, -3});
		System.out.println("===========================================");
		getArrayTriplets(new int[] {1, 3, 9, 2, 6, 4, 8, 5, 7});
	}
}
