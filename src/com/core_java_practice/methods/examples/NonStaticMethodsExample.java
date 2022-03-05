package com.core_java_practice.methods.examples;

import java.util.Scanner;

public class NonStaticMethodsExample {

	int a;
	int b;

	public int addition(int a, int b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a - b;

	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public float division(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {

		System.out.println("The output is");

		// hard coding
		NonStaticMethodsExample nonStaticMethodsExample = new NonStaticMethodsExample();
		nonStaticMethodsExample.a = 20;
		nonStaticMethodsExample.b = 20;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		nonStaticMethodsExample.a = scanner.nextInt();
		System.out.println("Enter the second  number:");
		nonStaticMethodsExample.b = scanner.nextInt();

		System.out.println("The addition of "
				+ nonStaticMethodsExample.a
				+ " and "
				+ nonStaticMethodsExample.b
				+ " is:"
				+ nonStaticMethodsExample.addition(nonStaticMethodsExample.a,
						nonStaticMethodsExample.b));

		System.out.println("The subtraction of "
				+ nonStaticMethodsExample.a
				+ " and "
				+ nonStaticMethodsExample.b
				+ " is:"
				+ nonStaticMethodsExample.subtraction(
						nonStaticMethodsExample.a, nonStaticMethodsExample.b));

		System.out.println("The multiplication of "
				+ nonStaticMethodsExample.a
				+ " and "
				+ nonStaticMethodsExample.b
				+ " is:"
				+ nonStaticMethodsExample.multiplication(
						nonStaticMethodsExample.a, nonStaticMethodsExample.b));

		System.out.println("The division of "
				+ nonStaticMethodsExample.a
				+ " and "
				+ nonStaticMethodsExample.b
				+ " is:"
				+ nonStaticMethodsExample.division(nonStaticMethodsExample.a,
						nonStaticMethodsExample.b));

		// The addition of a and b is:

	}

}
