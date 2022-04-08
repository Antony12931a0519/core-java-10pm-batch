package com.core_java_practice.arrays.examples.collections;

import java.util.ArrayList;
import java.util.List;

public class ListwithStringExample {

	public static void main(String[] args) {

		// ant,dog,fox

		List<String> animalNames = new ArrayList<>();

		animalNames.add("Dog");
		animalNames.add("Fox");
		animalNames.add("Dog");
		animalNames.add("Dog");
		animalNames.add("Dog");
		animalNames.add("Dog");
		animalNames.add("Dog");		
		

		for (String string : animalNames) {
			System.out.println(string);

		}

	}

}
