package com.java7.programs.array;

import java.util.Arrays;

public class ArrayReverseWitoutAdditionalArray {
	static void reverseArray(int inputArray[])
	{
		System.out.println("Array Before Reverse : "+Arrays.toString(inputArray));
		int temp;
		int n = inputArray.length;
		for (int i = 0; i < n/2; i++) 
		{
			temp = inputArray[i];
			inputArray[i] = inputArray[n-1-i];
			inputArray[n-1-i] = temp;
		}
		System.out.println("Array After Reverse : "+Arrays.toString(inputArray));
	}
	
	//With While Loop
	static void reverseArrayWithWhileLoop(int inputArray[])
	{
		System.out.println("Array Before Reverse : "+Arrays.toString(inputArray));
		int temp;
		int i=0;
		int n = inputArray.length;
		while (i < n/2) 
		{
			temp = inputArray[i];
			inputArray[i] = inputArray[n-1-i];
			inputArray[n-1-i] = temp;
			i++;
		}
		System.out.println("Array After Reverse with WHILE : "+Arrays.toString(inputArray));
	}
	public static void main(String[] args) 
	{   
		reverseArray(new int[]{4, 5, 8, 9, 10});
		System.out.println("-------------------------");
		reverseArray(new int[]{12, 9, 21, 17, 33, 7});
		System.out.println("-------------------------");
		reverseArrayWithWhileLoop(new int[]{891, 569, 921, 187, 343, 476, 555});
	}   
}
