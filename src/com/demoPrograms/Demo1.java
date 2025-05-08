package com.demoPrograms;

public class Demo1 {

	public static void main(String[] args) {
		String str = "The United States of America is a large country in North America.";
		String s = "large";
		if(str.contains(s)) {
			str = str.replaceAll(s, "");
		}
		System.out.println(str);
	}

}
