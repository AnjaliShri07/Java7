package com.java7.programs.String;

public class ExtractInt {

	public static void main(String[] args) {
		String str = "avbkjd1122klj4 543 af";
        System.out.print(extractInt(str));
	}

	static String extractInt(String str)
    {
        // Replacing every non-digit number with a space(" ")
        str = str.replaceAll("[^\\d]", "");
  
        // Replace all the consecutive white spaces with a single space
        str = str.replaceAll(" +", "");
  
        if (str.equals(""))
            return "-1";
  
        return str;
    }
}
