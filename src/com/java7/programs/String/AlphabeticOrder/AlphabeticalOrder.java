package com.java7.programs.String.AlphabeticOrder;

import java.io.*;
public class AlphabeticalOrder
{
	static String s;
	static int l;
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a word : ");
		s = br.readLine();
		l = s.length();
		
		char b[] = new char[l];
		for(int i=0; i<l; i++)
			b[i] = s.charAt(i);
		char t;
		for(int j=0; j<l-1; j++)
		{
			for(int k=0; k<l-1-j; k++)
			{
				if(b[k]>b[k+1])
				{
					t=b[k];
					b[k]=b[k+1];
					b[k+1]=t;
				}
			}
		}
		System.out.println("\nOriginal word : " + s);
		System.out.print("Sorted word : ");
		for(int m=0; m<l; m++)
			System.out.print(b[m]);
		System.out.print("\n");
	}
}