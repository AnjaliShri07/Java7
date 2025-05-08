package com.programs.array;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
	static Set<Integer> union(int[] ... inputArrays)
	{
		Set<Integer> unionSet = new HashSet<>();
		for (int[] inputArray : inputArrays)
		{
			for (int i : inputArray)
			{
				unionSet.add(i);
			}
		}
			return unionSet;
	}
	public static void main(String[] args)
	{   
		int[] inputArray1 = {2, 3, 4, 7, 1};
		int[] inputArray2 = {4, 1, 3, 5};
		int[] inputArray3 = {8, 4, 6, 2, 1};
		int[] inputArray4 = {7, 9, 4, 1};
		System.out.println(union(inputArray1, inputArray2, inputArray3, inputArray4));
	}
}
