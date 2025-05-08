package com.programs.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RemoveDuplicacy
{
	    public static void main(String args[])throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter any word : ");
	        String s = br.readLine();
	        int l = s.length();
	     	String ans=" ";
	         
	        for(int i=0; i < l; i++)
	        {
	        	char ch = s.charAt(i);
	            if(ch!=' ')
	            {
	            	ans = ans + ch;
	            }        
	            s = s.replace(ch,' '); //Replacing all occurrence of the current character by a space
	        }
	 
	       System.out.println("Word after removing duplicate characters : " + ans);
	    }
	    
	    /*char[] chars = s.toCharArray();
	    Set<Character> charSet = new LinkedHashSet<Character>();
	    for (char c : chars) {
	        charSet.add(c);
	    }

	    StringBuilder sb = new StringBuilder();
	    for (Character character : charSet) {
	        sb.append(character);
	    }
	    System.out.println(sb.toString());*/

}
