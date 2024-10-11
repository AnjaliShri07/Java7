package com.java7.programs.array;

public class SecondLargestInArrayExample {
	public static int getSecondLargest(int[] a){  
		int temp;  
		int total = a.length;
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}  
		public static void main(String args[]){
		int a[]={1,2,6,3,2,5};  
		int b[]={44,66,99,33,22,55,77}; 
		System.out.println("Second Largest: "+getSecondLargest(a));  
		System.out.println("Second Largest: "+getSecondLargest(b));  
		}
}
