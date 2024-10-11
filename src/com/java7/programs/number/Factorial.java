package com.java7.programs.number;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int f=1;
		for(int i=1; i <=num; i++)
		{
			f = f * i;
		}
		System.out.println("Number is : " + num);
		System.out.println("Facotrial of a Number : " + f);
	}

}
/*static int factorial(int n){    
	  if (n == 0)    
	    return 1;    
	  else    
	    return(n * factorial(n-1));    
	 }    
	 public static void main(String args[]){
	  int i,fact=1;  
	  int number=4;//It is the number to calculate factorial    
	  fact = factorial(number);   
	  System.out.println("Factorial of "+number+" is: "+fact);    
	 }  */