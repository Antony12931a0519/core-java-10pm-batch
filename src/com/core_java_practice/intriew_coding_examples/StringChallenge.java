package com.core_java_practice.intriew_coding_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringChallenge {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the string");
		String array = s.next();
		System.out.println("Entered input is :" + array);

		String[] inputValues = array.split(",");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String value : inputValues) {

			// System.out.println(value);

			String[] input = value.split(":");

			// System.out.println(input[0]);
			// System.out.println(input[1]);

			if (map.containsKey(input[0])) {
				int existingValue = map.get(input[0]);
				int newValue = Integer.parseInt(input[1]);
				map.put(input[0], (newValue + existingValue));
			} else {
				map.put(input[0], Integer.parseInt(input[1]));
			}

			// System.out.println(value);
		}

		for (Entry<String, Integer> m : map.entrySet()) {
			System.out.print(m.getKey() + ":" + m.getValue());
		}

	}

}
