package com.programs.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) 
    { 
        ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>(); 
        m.put(100, "Hello"); 
        m.put(101, "Geeks"); 
        m.put(102, "Geeks"); 
  
        // Here we can't add Hello because 101 key 
        // is already present in ConcurrentHashMap object 
        m.putIfAbsent(101, "Hello"); 
  
        // We can remove entry because 101 key 
        // is associated with For value 
        m.remove(101, "Geeks"); 
  
        // Now we can add Hello 
        m.putIfAbsent(103, "Hello"); 
  
        // We can't replace Hello with For 
        m.replace(101, "Hello", "For"); 
        System.out.println(m); 
    } 
}
