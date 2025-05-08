package com.programs.array;

public class NegativePositiveArrange {
	 static void ArrangeElements(int[] arr){
		 int a, j;
		 	for(int i=1; i<arr.length ; i++){
		 		a = arr[i];
		 		if(a > 0)
		 			continue;
		 		j = i-1;
		 		while(j>=0 && arr[j] >0){
		 			arr[j+1] = arr[j];
		 			j=j-1;
		 		}
		 		arr[j+1] = a;
		 	}
		 }
	public static void main(String[] args) {
		 int[] array = {4,-3,8,9,-1,5,2,-10,-11,45};
	        ArrangeElements(array);
        for (int j : array) {
            System.out.print(j + ",");
        }

	}

}
