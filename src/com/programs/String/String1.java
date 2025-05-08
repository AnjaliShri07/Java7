package com.programs.String;

public class String1
{

	public static void main(String[] args)
	{
		String str=" th2i3s is a st2r3ing";
		   String str1= str.replaceAll("[^A-Za-z]", "");
		    
		 System.out.println(str1);
		 
		 int index1=str1.indexOf('s');
		  int index2=str1.indexOf('g');
		  System.out.println(index1+" "+index2);
		  
		  StringBuilder str3 = new StringBuilder(str1);
		   System.out.println("string = " + str3);

		   // insert character at offset 8
		   str3.insert(index1+1, '5');
		    str3.insert(index2+2, '5');
		   // print StringBuilder after insertion
		   System.out.print("After insertion = ");
		   System.out.println(str3.toString());
		}

	}

