package com.programs.String;

public class SortingOfString {

	public static void main(String[] args) {
		String s = "edbca";
		int j= 0;
		char temp=0;
		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++)
		{
			for(j = 0; j < ch.length; j++)
			{
				if(ch[j] > ch[i])
				{
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		for(int k = 0; k < ch.length; k++)
		{
			System.out.print(ch[k]);
		}

	}

}
