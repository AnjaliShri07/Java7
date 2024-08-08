package com.java7.programs.hackerRank;

public class XorStrings2Program {
	public static String stringsXOR(String s, String t) {
	       
		  String result = new String("");
		        for(int i = 0; i < s.length(); i++) {
		            if(s.charAt(i) == t.charAt(i)) //just need to add an = sign
		                result += "0"; //add + before =
		            else
		                result += "1"; // add+ before =
		        }

		        return result;
		    }
	public static void main(String[] args) {
		String s1 = "10101";
		String s2 = "00101";
		System.out.println(stringsXOR(s1, s2));
	}

}
