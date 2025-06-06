package com.programs.number;

import java.util.Scanner;
//Write a program in Java to calculate the number of times a digit �D� appears in a number N.
//You have to take N and D as inputs from the user.
public class CountDigit {
	public static int countDigitFreq(int n,int D) {
		if(n == 0 && D == 0) return 1; //number 0 has 1 frequency of 0

		//if a negative number is entered
		if(n < 0) n = -n;

		int counter = 0;
		while(n != 0) {
			int digit = n % 10; //calculate the digit
			if(digit == D) counter++; 
			n = n/10;
		}

		return counter;
	}
	public static void main(String[] args) {
		// Your code goes here
				Scanner scn = new Scanner(System.in);
		        int n = scn.nextInt(); //input the number
				int d = scn.nextInt(); //input the digit

		        int x = countDigitFreq(n,d);
				System.out.println("The digit " + d + " occurs " + x + " times in " + n);

	}

}
