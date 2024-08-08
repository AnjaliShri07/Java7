package com.java7.programs.hackerRank;

public class TwoPairOfMatchingValue {

	public static boolean hasTwoPair(int[] arr) {
		boolean pairFound = false;
		int pairValue = Integer.MIN_VALUE;
		for(int s=0; s< arr.length-1; s++) {
			if(pairValue == arr[s]) {
				continue;
			}
			for(int c= s+1; c< arr.length; c++) {
				if(arr[s] == arr[c]) {
					if(arr[s] != pairValue) {
						if(pairFound) {
							return true;
						}
						pairValue = arr[s];
						pairFound = true;
						break;
					}
				}
					
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,2,1};  //{7,7,7}--> false
		System.out.println(hasTwoPair(arr));

	}

}
