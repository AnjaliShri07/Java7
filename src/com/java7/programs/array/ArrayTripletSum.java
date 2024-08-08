package com.java7.programs.array;

import java.util.Arrays;
import java.util.HashSet;

// Write a Java program which finds triplets in the given array whose sum is equal to given number?
public class ArrayTripletSum {
	// Using Sorting
	private static void getArrayTriplets(int[] inputArray, int sum)
	{
		System.out.println("Input Array : "+Arrays.toString(inputArray));
		System.out.println("Given Number : "+sum);
		System.out.println("Array triplets whose sum is "+sum+" are :");
		
		Arrays.sort(inputArray);
		for (int i = 0; i < inputArray.length-2; i++) 
		{
			int left = i+1;
			int right = inputArray.length-1;
			while (left < right)
			{
				if (inputArray[i] + inputArray[left] + inputArray[right] == sum) 
				{
					System.out.println("["+inputArray[i] + ", " + inputArray[left] + ", " + inputArray[right]+"]");
					left++;
					right--;
				} 
				else if (inputArray[i] + inputArray[left] + inputArray[right] < sum)
				{
					left++;
				}
				else
				{
					right--;
				}
			}
		}
	}
	/*
	 * Time complexity: O(N^2). There are only two nested loops traversing the array, so time complexity is O(n^2). 
	 * Two pointers algorithm takes O(n) time
	 * and the first element can be fixed using another nested traversal. 
	 * Space Complexity: O(1). As no extra space is required.
	 */
	
	
	//using HashSet
	private static void getArrayTripletsUsingHashSet(int[] inputArray, int sum) 
	{
		System.out.println("Input Array : "+Arrays.toString(inputArray));
		
		System.out.println("Given Number : "+sum);
		
		System.out.println("Array triplets whose sum is "+sum+" are :");
		
		//Method 2 : Using HashSet
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < inputArray.length-1; i++) 
		{	
			for (int j = i+1; j < inputArray.length; j++)
			{	
				if (set.contains(sum - inputArray[i] - inputArray[j])) 
				{	
					System.out.println("getArrayTripletsUsingHashSet : " + "["+inputArray[i]+", "+inputArray[j]+", "+(sum - inputArray[i] - inputArray[j])+"]");
				}
				else 
				{
					set.add(inputArray[j]);
				}
			}
		}
	}
	
	/*
	 * Time complexity: O(N^2) 
	 * Auxiliary Space: O(N)
	 */
	
	private static void getArrayTripletsBruteForce(int[] inputArray, int sum)
	{
		System.out.println("Input Array : "+Arrays.toString(inputArray));
		
		System.out.println("Given Number : "+sum);
		
		System.out.println("Array triplets whose sum is "+sum+" are :");
		
		//Method 1 : Using Brute Force Method
		
		for (int i = 0; i < inputArray.length-2; i++) 
		{
			for (int j = i+1; j < inputArray.length-1; j++) 
			{
				for (int k = j+1; k < inputArray.length; k++)
				{
					if (inputArray[i]+inputArray[j]+inputArray[k] == sum) 
					{	
						System.out.println("["+inputArray[i]+", "+inputArray[j]+", "+inputArray[k]+"]");
					}
				}
			}
		}
	}

	/*
	 * Time Complexity: O(n3). There are three nested loops traversing the array, so
	 * the time complexity is O(n^3) 
	 * Space Complexity: O(1). As no extra space is required.
	 */
	
	
	public static void main(String[] args) 
	{
		getArrayTriplets(new int[] {7, 5, 9, 3, 0, 8, 6}, 12);   //[0, 3, 9]
																 //[0, 5, 7]
		System.out.println("===========================");
		getArrayTripletsUsingHashSet(new int[] {-3, 7, -1, -5, 2, -9, 1}, 0);
		System.out.println("===========================");
		getArrayTriplets(new int[] {17, 51, 39, 29, 33, 21, 65}, 89);
		
	}
}
