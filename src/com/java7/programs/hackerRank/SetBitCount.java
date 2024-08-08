package com.java7.programs.hackerRank;

public class SetBitCount {
	static int countSetBits(int L, int R)
	{
	    // Count variable
	    int count = 0;
	  
	    for (int i = L; i <= R; i++)
	    {
	        // Find the set bit in Nth number
	        int n = i;
	        while (n > 0)
	        {
	            // If last bit is set
	            count += (n & 1);
	  
	            // Left sift by one bit
	            n = n >> 1;
	        }
	    }
	  
	    // Return count
	    return count;
	}
	public static void main(String[] args) {
		// Given Range L and R
	    int L = 2, R = 5;
	    
	    // Function Call
	    System.out.print("Total set Bit count is : " + countSetBits(L, R));

	}

}
/*
Input: L = 3, R = 5 
Output: 5 
Explanation: (3)10 = (11)2, (4)10 = (100)2, (5)10 = (101)2 
So, Total set bit in range 3 to 5 is 5

Input: L = 10, R = 15 
Output: 17
*/