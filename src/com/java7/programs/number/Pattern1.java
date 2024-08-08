package com.java7.programs.number;

public class Pattern1 {

	public static String numberPattern(int start, int end) {
		 StringBuilder b = new StringBuilder();
		for(int i=start; i<end; i++) {
			for(int j=start; j<end; j++) {
				if(j != 4) {
					b.append(j +",");
				}
				
			}
			
		}
		return b.toString();
	}
	public static void main(String[] args) {
		System.out.println(Pattern1.numberPattern(1,5));

	}

}
