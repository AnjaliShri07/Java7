package com.programs.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteatortion {

	public static void main(String[] args) {
		Map<Integer, String> hash_map = new HashMap<Integer, String>();
		// inserting value.
		hash_map.put(1, "Thor");
		hash_map.put(2, "Iron man");
		hash_map.put(3, "Captan America");
		// setting up iterator.
		Iterator<Entry<Integer, String>> it = hash_map.entrySet().iterator();
		// iterating every set of entry in the HashMap. 
		while (it.hasNext()) {
			Entry<Integer, String> set = (Entry<Integer, String>) it.next();
			System.out.println(set.getKey() + " = " + set.getValue());
		}

	}

}
