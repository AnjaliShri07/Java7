package com.java7.programs.number;

import java.util.Scanner;

/*Write a Java Program to calculate xn (x to the power n) using Recursion. 
You can use O(N) time but can�t use any extra space apart from the Recursion Call Stack Space.*/
public class Power {
	public static double power(double x, int n) {
        if(n == 0) return 1.0;
        
        double xpnm1 = power(x,n-1); //x power n-1 (xpnm1)
		return x * xpnm1; 
    }
    
    public static double pow(double x, int n) {
        if(n < 0) {
            return 1.0 / power(x,-n);
        }
        
        return power(x,n);
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double x = scn.nextDouble();
		int n = scn.nextInt();

        System.out.println(pow(x,n));

	}

}
/*
 * Time - O(N) 
 * Auxiliary Space - O(1)
 */