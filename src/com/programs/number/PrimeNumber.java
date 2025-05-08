package com.programs.number;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		for(int i = 2; i <= num/2; i++)  // condition for non-prime number
		{
			if(num % i == 0)
			{
				count++;
				break;
			}
		} 
		if(count == 0 && num != 1)
		{
			System.out.println(num + " is prime number");
		}
		else
		{
			System.out.println(num + " is not prime number");
		}

	}

}
