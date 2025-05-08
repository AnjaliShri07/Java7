package com.programs.collections;

import java.util.LinkedHashMap;

public class Demo5 {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> m = new LinkedHashMap<String, Integer>();

		m.put("Linked", new Integer(1));
		m.put("Map", new Integer(2));

		Integer lobj = m.get("Linked");
		System.out.println(lobj);
		System.out.println(m.get("Map"));
		System.out.println(m.size());

	}

}
/*

1
2
2

*/