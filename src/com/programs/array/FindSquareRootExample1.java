package com.programs.array;

import java.util.Scanner;

public class FindSquareRootExample1 {
	  
		public static void main(String[] args)
		{   
		System.out.print("Enter a number: ");  
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();  
		System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
		}  	

	public static double squareRoot(int num) {
		double t;// temporary variable
		double sqrtroot = (double) num / 2;
		do {
			t = sqrtroot;
			sqrtroot = (t + (num / t)) / 2;
		} while ((t - sqrtroot) != 0);
		return sqrtroot;
	}
	
	//Double squareroot = Math.pow(num, 0.5);
}
