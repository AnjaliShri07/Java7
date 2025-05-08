package com.programs.number;

import java.util.ArrayList;

//0, 1, 4, 9, 10, 11, 14, 19, 20, 21, 24

public class NthOdd {
	public static int nthOdd(int n) {
		ArrayList<Integer> a = new ArrayList<Integer>(n);
		a.add(0);
		int odd=0;
		for(int i=1; i<=n; i++)
		{
			odd += i+i -1;
			 a.add(odd);
		}
		
		int nthOdd = a.get(n);
		
		return (a.get(n)); 
		
	}
	public static void main(String[] args) {
		int n=3;
		System.out.println(nthOdd(n));

	}

}
