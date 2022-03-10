package com.core_java_practice.arrays.examples;

public class IntArrayExample {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 3, 4, 5, 6, 70, 8, 9 };
		int[] marks = new int[3];
		marks[0] = 1;
		marks[1] = 11;
		marks[2] = 111;

		System.out.println(marks);

		for (Integer mark : marks) {

			System.out.println(mark);
		}
		// System.out.println("Number at oth indiex is :"+numbers[-1]);

		System.out.println(numbers);
		// hashcode
		System.out.println("Lengith:" + numbers.length);
		for (int i = 0; i <= numbers.length - 1; i++) {
			System.out.println(numbers[i]);
		}

		for (Integer number : numbers) {
			System.out.println(number);
		}

	}

}
