package com.capgemini.demo.col;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		
		System.out.println("adding element in HashSet--");
		hs.add("a");
		hs.add("m");
		hs.add("a");
		hs.add("n");
		hs.add("i");
		
		System.out.println(hs);
	}

}
