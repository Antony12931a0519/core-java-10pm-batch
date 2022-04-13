package com.core_java_practice.arrays.examples.collections;

import java.util.HashMap;
import java.util.Map;

public class MapWithPredefindedExample {
	public static void main(String[] args) {
		
		Map<Integer,Double> map = new HashMap<Integer,Double>();
		map.put(1, (double) 334);
		map.put(1, (double) 334);
		map.put(1, 334.0);
		
		System.out.println(map);
		
	}

}
