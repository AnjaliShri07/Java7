package com.programs.hackerRank;

public class ArrayContainsAllK {

	public boolean solution1(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if ((A[i] + 1 != A[i + 1]) && (A[i] !=A[i+1]))
                return false;
        }
        if (A[0] != 1 || A[n - 1] != K)
            return false;
        else
            return true;
    }

	public static void main(String[] args) {
		int[] arr = new int[] {1,1,3};   // {1,1,2,3,4,5} k=5--> true
		ArrayContainsAllK result = new ArrayContainsAllK();
		System.out.println(result.solution1(arr, 2));
	}

}
