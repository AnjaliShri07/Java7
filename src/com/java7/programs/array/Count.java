package com.java7.programs.array;

import java.util.Scanner;

public class Count
{
	    public static void main(String[] args) throws Exception {

	    	int i, b;
	    	int count=0;
	    	Scanner sc = new Scanner(System.in);
			System.out.print("Enter number of element you want in array : ");
			int num = sc.nextInt();
			
			int[] a = new int[num];
			System.out.println("Enter elements of array : ");
			for(i=0; i< num; i++)
			{
				a[i] = sc.nextInt();
			}
	        System.out.println("Enter a another number: ");
	        b= sc.nextInt();
	        for(i=0; i< num; i++)
	        {
	            if(b == a[i])
	            {
	                count++;
	            }
	        }
	        System.out.println(count);
	   }
	}
