package com.java7.programs.array;

import java.util.HashSet;

public class CommonElements {
	public static void main(String[] args)
	{
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < s1.length; i++)
		{
			for (int j = 0; j < s2.length; j++)
			{
				if(s1[i].equals(s2[j]))
				{
					set.add(s1[i]);
				}
			}
		}
		System.out.println(set);     //OUTPUT : [THREE, FOUR, FIVE]
	}


	//Second method
	/*
	Integer[] i1 = {1, 2, 3, 4, 5, 4};
	Integer[] i2 = {3, 4, 5, 6, 7, 4};
	HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
	HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
	set1.retainAll(set2);
	System.out.println(set1);  
	 */ 
}
