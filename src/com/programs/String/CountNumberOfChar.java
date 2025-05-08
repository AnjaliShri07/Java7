package com.programs.String;




public class CountNumberOfChar {
 
 public static void main(String[] args) {
  
				 String str = "anjali shrivastava";
				 				 
				 String chr="a";
				 
				 int charCount = str.length() - str.replaceAll(chr, "").length();
				 
				 System.out.println("No. of occurances: "+charCount);
 
 			}

}
