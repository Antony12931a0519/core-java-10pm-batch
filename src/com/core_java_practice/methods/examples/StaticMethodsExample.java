package com.core_java_practice.methods.examples;

import java.util.Scanner;

public class StaticMethodsExample {

	static int a;
	static int b;

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int subtraction(int a, int b) {
		return a - b;

	}

	public static int multiplication(int a, int b) {
		return a * b;
	}

	public static float division(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {

		System.out.println("The output is");

		addition(a, b);
		// hard coding
		a = 20;
		b = 20;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = scanner.nextInt();
		System.out.println("Enter the second  number:");
		b = scanner.nextInt();

		System.out.println("The addition of " + a + " and " + b + " is:"
				+ addition(a, b));

		System.out.println("The subtraction of " + a + " and " + b + " is:"
				+ subtraction(a, b));

		System.out.println("The multiplication of " + a + " and " + b + " is:"
				+ multiplication(a, b));

		System.out.println("The division of " + a + " and " + b + " is:"
				+ division(a, b));

		// The addition of a and b is:

	}

}
