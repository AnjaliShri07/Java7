package com.programs.String;

import java.util.Scanner;

public class Sort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		 String s = sc.nextLine();
		int l = s.length();
		char[] ch = new char[l];
		for(int i = 0; i < l; i++)  
		{
			ch[i] = s.charAt(i);  // convert each letter of the word to its corresponding ASCII value.
		}
		char t;
		for(int j = 0; j < l-1; j++)
		{
			for(int k = 0; k < l-1-j ; k++)
			{
				if(ch[k] > ch[k+1])   //compare each letter of the word by its next letter and swap them if the first letter has
													// a great ASCII value than the next one.
				{
					t = ch[k];
					ch[k] = ch[k+1];
					ch[k+1] = t;
				}
			}
		}
		System.out.println("\nOriginal word : " + s);
		System.out.println("Sorted word :");
		for(int m = 0; m < l; m++)
		{
			System.out.print(ch[m]);
		}
	}
	}


