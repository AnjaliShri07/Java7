package com.TrickyPrograms.collection;

import java.util.HashMap;
import java.util.Map;

class A{
	String name;
	Integer id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
public class Getmap {

	public static void main(String[] args) {
		Map<A, String> map = new HashMap<>();
		A a = new A();
		map.put(a, "");
		map.put(a, "2");
		String str = map.get(a);
		System.out.println(str);
		System.out.println("Size: "+ map.size());

	}

}
