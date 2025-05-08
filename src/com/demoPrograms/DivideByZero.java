package com.demoPrograms;

public class DivideByZero {

	public static void main(String[] args) {
		double a, b,c;  //can be float also and we need to cast value to float
        a = 3.0/0;
        b = 0/4.0;
        c = 0/0.0;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

	}

}

/*
 * Explanation: For floating point literals, we have constant value to represent
 * (10/0.0) infinity either positive or negative and also have NaN (not a number
 * for undefined like 0/0.0), but for the integral type, we don�t have any
 * constant that�s why we get an arithmetic exception.
 */