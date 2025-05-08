package com.TrickyPrograms.string;

public class StringIntern {

	public static void main(String[] args) {
		 String s1 = "hello";
	     String s2 = new String("hello");
	     System.out.println(s1 == s2);
	     s2 = s2.intern();   // intern() creates an exact copy of the heap string object in the String Constant Pool.
	     System.out.println(s1 == s2);

	}

}
