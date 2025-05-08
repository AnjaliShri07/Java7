package com.programs.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	public static void main(String[] args) {

        ConcurrentHashMap<String,String> conHashMap = new ConcurrentHashMap<String,String>();
        conHashMap.put("A","Apple");
        conHashMap.put("B","Blackberry");
        for (Map.Entry<String,String> e : conHashMap.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
