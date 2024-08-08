package com.java7.programs.String;

public class Pangram {
	static int size = 26;  
	//function to check if character is a letter or not  
	static boolean isLetter(char ch)  
	{  
		if (!Character.isLetter(ch))  
			//returns false if character is not a letter   
			return false;  
		//returns true if character is a letter   
		return true;  
	}  
	//function to check all the letters (a to z) are presented in the given string or not  
	static boolean containsAllLetters(String str, int len)  
	{  
		//converts the given string into lowercase  
		str = str.toLowerCase();  
		//creating a boolean array that stores the presence of letters  
		boolean[] present = new boolean[size];  
		//loop traverse over each character of the string  
		for (int i = 0; i < len; i++)   
		{  
			//checks if the current character is a letter  
			if (isLetter(str.charAt(i)))   
			{  
				int letter = str.charAt(i) - 'a';  
				//marks the current letter as present  
				present[letter] = true;  
			}  
		}  
		//loop iterate over every letter of the given string   
		for (int i = 0; i < size; i++)   
		{  
			if (!present[i])  
				//returns false if the current character is not presented in the string  
				return false;  
		}  
		//returns true if the current character is presented in the string  
		return true;  
	}  
	public static void main(String[] args) {
		String s = "We promptly judged antique ivory buckles for the next prize";  
		//String s = "The quick brown fox jumped over the lazy dog"; 
		//String s = "We promptly judged antique ivory buckles for the prize";
		String str= s.replace(" ", "");
		//determines the length of the given string  
		int len = str.length();  
		//function calling  
		if (containsAllLetters(str, len))  
			System.out.print("pangram");  
		else  
			System.out.print("not pangram");  

	}

}
