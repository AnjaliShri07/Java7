package com.demoPrograms;

import java.util.HashMap;



public class HashBoolean {
	 public static void main(String[] args) {
	        Integer count =1;
		 HashMap<String, Object>	data = new HashMap<String, Object>();
		 data.put("emailalreadyexists", (count!=null && count.intValue()>0) ? Boolean.TRUE : Boolean.FALSE);
		 System.out.println(data);
	    }
}
