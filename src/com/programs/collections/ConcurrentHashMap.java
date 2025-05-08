package com.programs.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentHashMap {

	public static void main(String[] args) {
		Map<String, String> myMap= new java.util.concurrent.ConcurrentHashMap<String, String>();
		myMap.put("1", "A");
		myMap.put("2", "B");
		myMap.put("3", "C");
		myMap.put("4", "D");
		myMap.put("5", "E");
		myMap.put("6", "F");
	    System.out.println("ConcurrentHashMap before iterator: "+myMap);
		
		Iterator<String> it = myMap.keySet().iterator();

		while(it.hasNext()){
			String key = it.next();
			if(key.equals("3")) 
				myMap.put(key+"new", "new3");
		}
		System.out.println("ConcurrentHashMap after iterator: "+myMap);
		
		
		//HashMap
				myMap = new HashMap<String,String>();
				myMap.put("1", "A");
				myMap.put("2", "B");
				myMap.put("3", "C");
				myMap.put("4", "D");
				myMap.put("5", "E");
				myMap.put("6", "F");
				System.out.println("HashMap before iterator: "+myMap);
				Iterator<String> it1 = myMap.keySet().iterator();
				
				while(it1.hasNext()){
					String key = it1.next();
					if(key.equals("3")) 
						myMap.put(key+"new", "new3");
				}
				System.out.println("HashMap after iterator: "+myMap);
	}

}

/*Explanation :- Looking at the output, it�s clear that ConcurrentHashMap takes care of any new 
entry in the map whereas HashMap throws ConcurrentModificationException.
Let�s look at the exception stack trace closely. The statement that has thrown Exception is:
It means that the new entry got inserted in the HashMap but Iterator is failing. Actually, 
Iterator on Collection objects is fail-fast i.e any modification in the structure or the number 
of entries in the collection object will trigger this exception thrown by the iterator.
*/
