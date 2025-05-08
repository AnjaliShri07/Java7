package com.programs.realSenario;

import java.util.HashSet;

public class HappyNumbers {
	public static boolean happy(long number) {
	    long m = 0;
	    int digit = 0;
	    HashSet<Long> cycle = new HashSet<Long>();
	    while (number != 1 && cycle.add(number)) {
	      m = 0;
	      while (number > 0) {
	        digit = (int) (number % 10);
	        m += digit * digit;
	        number /= 10;
	      }
	      number = m;
	    }
	    return number == 1;
	  }
	 
	  public static void main(String[] args) {
	    for (long num = 1, count = 0; count < 20; num++) {
	      if (happy(num)) {
	        System.out.println(num);
	        count++;
	      }
	    }
	  }
}
