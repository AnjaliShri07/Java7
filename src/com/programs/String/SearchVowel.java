package com.programs.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchVowel
{
	public static void main(String[] args) throws IOException
	{
		String s;
		String  vowels="";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a word : ");
		s = br.readLine();
		int l=s.length();
		
		for(int i = 0; i < l; i++)
		{
		   char ch= s.charAt(i);
		
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
				ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
		{
				vowels +=ch +"";
		}
	}
		System.out.println("The vowel are :" +vowels);
		 char[] word=vowels.toCharArray();

		    for(int i=0; i<(word.length-1); i++)
		    {
		       for(int j=i+1; j>0; j--)
		       {
		            if(word[j]<word[j-1])
		            {
		                char temp=word[j-1];
		                word[j-1]=word[j];
		                word[j]=temp;
		            }
		        }
		    }
		    vowels=String.valueOf(word);
		    System.out.println("Vowels in ascending order: " +vowels);
   }
}



