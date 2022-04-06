package com.core_java_practice.control.statements;

import java.util.Scanner;

public class SwitchAssignment {

	static int a;
	static int b;

	public static int addition(int a, int b) {
		return a + b;

	}

	public static int Subtraction(int a, int b) {
		return a - b;

	}

	public static int division(int a, int b) {
		return a / b;

	}

	public static int multiplication(int a, int b) {
		return a * b;

	}

	public static void fallback() {
		System.out.println("No matchng option is selected");

	}

	public static void main(String[] args) {

		System.out.println("The options available in the calculator are:");

		System.out
				.println("1.Addition \n 2.Subtraction \n 3.Division \n 4.Multiplication");

		System.out.println("Please selection ay option from the abve list");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int selectedOption = scanner.nextInt();

		System.out.println("Please enter the value for first number:");

		a = scanner.nextInt();

		System.out.println("Please enter the value for second number:");

		b = scanner.nextInt();

		switch (selectedOption) {

		case 1:
			System.out.println("Addition of " + a + "and " + b + " is "
					+ addition(a, b));
			;
			break;
		case 2:
			System.out.println("Subtraction of " + a + "and " + b + " is "
					+ Subtraction(a, b));
			break;
		case 3:
			System.out.println("division of " + a + "and " + b + " is "
					+ division(a, b));
			break;
		case 4:
			System.out.println("multiplication of " + a + "and " + b + " is "
					+ multiplication(a, b));
			break;
		default:
			fallback();
			break;

		}

	}

}
