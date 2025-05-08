package com.programs.hackerRank;

public class SumOfMaxEvenAndOdd {

	public static int solution(int[] A) {
        int even=0,odd=0;
        for(int i=0; i< A.length; i++){
            if(A[i]%2 == 0){
                if(even == 0 || even < A[i]){
                    even = A[i];
                }
            }else{
                if(A[i]%2 != 0){
                    if(odd == 0 || odd < A[i]){
                        odd = A[i];
                    }
                }
            }
        }
        return (even+odd);
    }

	public static void main(String[] args) {
		int A[] = new int[] {5, 8, 10, 11};
		System.out.println("Sum of Largest Even and Odd : "+ solution(A));

	}

}
