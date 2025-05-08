package com.TrickyPrograms.collection;

import java.util.HashMap;
import java.util.Map;

public class SizeMapWrapper {

	public static void main(String[] args) {
		Integer i1= new Integer(1);
		Integer i2= new Integer(1);
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(i1, "One");
		map.put(i2, "One");
		System.out.println(map.size());

	}

}
