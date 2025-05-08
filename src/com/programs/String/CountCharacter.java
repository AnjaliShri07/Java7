package com.programs.String;


public class CountCharacter {

	public static void main(String[] args) {
		String input = "anjali shrivastava";
		int count = 0;
		for(char ch : input.toCharArray()) //for printing chr wise chr 
		{
			if(ch == 'a')
			{
				count++;
			}
		}
		System.out.println("Count : " + count);
	}
}
