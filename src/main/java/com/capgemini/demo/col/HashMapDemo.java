package com.capgemini.demo.col;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("One", 1);
		map.put("TwO", 2);
		map.put("Three", 3);
		
		Set<Entry<String , Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> entry:entrySet) {
		
			System.out.println("Key:"+entry.getKey()+" value:"+entry.getKey());
		}
	}
}
