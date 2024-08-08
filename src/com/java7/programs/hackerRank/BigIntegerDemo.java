package com.java7.programs.hackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        BigInteger n1 = new BigInteger(sc.next());
        BigInteger n2 = new BigInteger(sc.next());
        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
        sc.close();
	}

}
