package com.programs.hackerRank;

import java.util.Scanner;

public class RegexIP {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	}

}
class MyRegex
{
         String pattern = 
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

}


/*
 * IP address is a string in the form "A.B.C.D", where the value of A, B, C, and
 * D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C,
 * or D can't be greater than 3.
 * 
 * 
 * 
 * Some valId IP address:

000.12.12.034
121.234.12.12
23.45.12.56
Some invalId IP address:

000.12.234.23.23
666.666.23.23
.213.123.23.32
23.45.22.32.
I.Am.not.an.ip
 */