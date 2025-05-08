package com.programs.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDiff {
	 public static int diagonalDifference(List<List<Integer>> arr) {
		    int d1 = 0, d2 = 0;
		    int n= arr.size();
		      
		        for (int i = 0; i < n; i++)
		        {   
		            for (int j = 0; j < n; j++)
		            {
		                // finding sum of primary diagonal
		                if (i == j)
		                    d1 += arr.get(i).get(j);
		      
		                // finding sum of secondary diagonal
		                if (i == n - j - 1)
		                    d2 += arr.get(i).get(j);;
		            }
		        }
		      
		        // Absolute difference of the sums
		        // across the diagonals
		        return Math.abs(d1 - d2);

		    }

	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();

	}

}
/*
Sample Input

3
11 2 4
4 5 6
10 8 -12

Sample Output

15
*/