package com.core_java_practice.arrays.examples.collections;

import java.util.HashSet;
import java.util.Set;

public class SetWithStringExample {
	
	public static void main(String[] args) {
		
		Set<String> names = new HashSet<String>();
		names.add("Anthony");
		names.add("Anthony");
		names.add("Anthony");
		names.add("Anthony");
		names.add("Sampath");
		names.add("Anthony");
		names.add("Kumar");
		
		System.out.println(names);
		
		
	}

}
