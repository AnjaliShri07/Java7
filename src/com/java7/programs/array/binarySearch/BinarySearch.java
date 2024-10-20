package com.java7.programs.array.binarySearch;

import java.util.Scanner;

class BinarySearch { 
	public static void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;
		   while( first <= last ){  
		      if ( arr[mid] < key ){
		        first = mid + 1;
		      }else if ( arr[mid] == key ){
		        System.out.println("Element is found at index: " + mid);
		        break;  
		      }else{  
		         last = mid - 1;
		      }
			   mid = (first + last)/2;
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  
		 public static void main(String[] args){
			 int c, n, search, arr[];
			 Scanner in = new Scanner(System.in);
			    System.out.println("Enter number of elements");
			    n = in.nextInt();
			    arr = new int[n];
			 
			    System.out.println("Enter " + n + " integers");
			 
			    for (c = 0; c < n; c++)
			      arr[c] = in.nextInt();
			 
			    System.out.println("Enter value to find");
			    search = in.nextInt();
			    
		        int last=arr.length-1;  
		        binarySearch(arr,0,last,search);     
		 }  
} 