package com.java7.programs.array;

public class FactorOfArray {

	public static void loop1(int temp, int factor) {
		while(temp % factor == 0) {
			temp = temp/factor;
			System.out.print(temp +",");
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,24,63,57};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1)
				System.out.println(arr[i]);
			else {
				int temp=0, factor=2;
				temp = arr[i];
				if(temp % factor == 0)
					loop1(temp, factor);
				else {
					factor++;
					loop1(temp, factor);
				}
			}
			
		}

	}

}
