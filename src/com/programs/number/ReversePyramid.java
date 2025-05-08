package com.programs.number;

public class ReversePyramid
{
	public static void incrementPatternPrint(int start, int n)
	 {
	    for(int i=0 ; i <= n-1; i++){
	        for(int j=0; j <= i; j++){
	            System.out.print(start);
	        }
	        System.out.println();
	        start+= 1;
	    }
	    start= start-1;
	    for(int k=0; k<=n-1; k++){
	     for(int l=0; l<= n-k-1; l++){
	         System.out.print(start);
	     }
	     System.out.println();
	     start= start-1;
	    }
	 }
	  public static void main(String []args){
		  ReversePyramid r = new ReversePyramid();
		  r.incrementPatternPrint(1,4);
	  }

	 }
	 

