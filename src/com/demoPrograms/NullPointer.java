package com.demoPrograms;

public class NullPointer {

	public static void main(String[] args) {
		Integer accountid =0;
		
		if(!accountid.equals(0)) {
			System.out.println("zero");
		}else {
			System.out.println("number");
		}
	}

}
