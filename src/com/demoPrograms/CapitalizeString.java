package com.demoPrograms;

import java.util.Scanner;

public class CapitalizeString {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String str= sc.nextLine();
		 System.out.print(str.substring(0, 1).toUpperCase() + str.substring(1));

	}

}
