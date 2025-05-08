package com.programs.collections;

import java.util.HashMap;
import java.util.Map;

class Employee{
	Integer id;
	String name;
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
public class Demo4 {
	public static void main(String[] args) {
		Map<Employee,Integer> map = new HashMap<Employee,Integer>();
		//Employee e1 = new Employee(1, "Ajit");
		map.put(new Employee(1, "Ajit"),100);
		map.put(new Employee(1, "Ajit"),200);
		Integer i = map.get(new Employee(1, "Ajit"));
		System.out.println("map.get : "+i);
		System.out.println("Size: "+ map.size());
	}

}
