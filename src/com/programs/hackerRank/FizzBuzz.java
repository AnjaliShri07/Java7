package com.programs.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {
	 public static void fizzBuzz(int n) {
		    for(int i=1; i<=n;i++){
		       if(i%3==0 && i%5==0) {
		          System.out.println("FizzBuzz"); 
		       }else if(i%3==0){
		           System.out.println("Fizz");
		           }else if(i%5==0){
		               System.out.println("Buzz");
		           }else{
		               System.out.println(i);
		           }

		    }
	 }
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        FizzBuzz.fizzBuzz(n);

	        bufferedReader.close();
	    }
	

	}


