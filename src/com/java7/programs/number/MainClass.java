package com.java7.programs.number;

import java.util.Scanner;

public class MainClass
{
	public static void m1 (int rows)
	 {
		  
			for (int i = 1; i <= rows; i++) 
		      {
		            for (int j = 1; j <= i; j++)
		            {
		                System.out.print(i);
		            }
		             
		            System.out.println();
		        }
	}
    public static  void main(String []args)
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
        m1(rows);
    }
}
