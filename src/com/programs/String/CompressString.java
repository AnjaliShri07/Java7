package com.programs.String;

public class CompressString {

	public static String compress(String str) {
	    int count = 1;
	    StringBuilder builder = new StringBuilder();

	    for (int i = 1; i < str.length() - 1; i++) {
	        if (str.charAt(i) == str.charAt(i - 1)) {
	            count++;
	        } else {
	            builder.append(str.charAt(i - 1));
	            builder.append(count);
	            count = 1;
	        }
	    }
	    // special cases for last chars
	    if (str.length() > 1) {
	        if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2)) {
	            count++;
	        } else {
	            builder.append(str.charAt(str.length() - 2));
	            builder.append(count);
	            count = 1;
	        }
	        builder.append(str.charAt(str.length() - 1));
	        builder.append(count);
	    }
	    return builder.toString();
	}
	
	public static void main(String[] args) {
		String str = "AABBCCABCE"; //"1ggggggfffssssy";
		System.out.println("Compressed String : "+CompressString.compress(str));

	}

}
