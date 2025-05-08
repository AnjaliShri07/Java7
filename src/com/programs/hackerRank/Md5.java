package com.programs.hackerRank;

import java.security.MessageDigest;
import java.util.Scanner;

public class Md5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String text = in.nextLine();
		in.close();
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");   // SHA-256
			md.update(text.getBytes());
			byte[] md5Hash = md.digest();
			for (byte b : md5Hash) {
				System.out.printf("%02x", b);
			}
		} catch (Exception e) {

		}
	}

}
