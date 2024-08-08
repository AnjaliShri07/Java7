package com.java7.programs.array;

public class MaxConsecutiveOnes {
	public static int maxCons(int arr[]) {
		int maximum=0;
		int i=0;
		while(i < arr.length) {
			int consOns=0;
			while(i< arr.length && arr[i] == 1) {
				consOns++;
				i++;
			}
			
			maximum=Math.max(maximum, consOns);
			i++;
		}
		return maximum;
		
	}

	public static void main(String[] args) {
		int arr[] = {1,1,1,1,0,1,1,1};
		int count=0;
		int result=0;
		for(int i=0; i< arr.length;i++) {
			if(arr[i] == 0)
				count = 0;
			else {
				count++;
				result = Math.max(result, count);
			}
		}
		System.out.println(result);
		
		System.out.println("Using While Loop : "+ maxCons(arr));
	}

}
