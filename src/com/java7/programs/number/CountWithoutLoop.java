package com.java7.programs.number;

public class CountWithoutLoop {
	public static void main(String[] args) {
		int i=1;
		int num = 4;
		while(i<= num) {
			System.out.println("ASC : " + i);
			i++;
		}
		while(num >=1) {
			System.out.println("DESC : " + num);
			num--;
		}
	}

}
