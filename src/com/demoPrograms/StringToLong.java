package com.demoPrograms;

public class StringToLong {

	public static void main(String[] args) {
		String bookid = "9783845317724";
		Long bookID ;
		bookID = Long.valueOf(bookid);
		System.out.println("bookID ==> "+ bookID);
	}

}
