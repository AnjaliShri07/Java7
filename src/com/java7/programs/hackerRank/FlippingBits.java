package com.java7.programs.hackerRank;



public class FlippingBits {
	 public static long flippingBits(long n) {
		    // Write your code here
		        long num = (1L<<32)-1;
		        return n^num;
		    }

	public static void main(String[] args) {
		System.out.println(flippingBits(2147483647));
		System.out.println(flippingBits(1));
		System.out.println(flippingBits(0));

	}

}

/*
Sample Input

3 
2147483647 
1 
0
Sample Output

2147483648 
4294967294 
4294967295

Explanation

Take 1 for example, as unsigned 32-bits is 00000000000000000000000000000001 
and doing the flipping we get 11111111111111111111111111111110 which in turn is 4294967294.
*/