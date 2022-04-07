package com.core_java_practice.arrays.examples.exceptionhandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("Hello Welcome to my App");
		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getMessage());
			System.out
					.println("any value with division 0 cannot be caluclated in java");
		}

		catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			System.out
					.println("any value with division 0 cannot be caluclated in java");
		} finally {
			System.out.println("End");
		}
		System.out.println("Thank you for visiting the App");
		System.out.println("Thank you for visiting the App");
		System.out.println("Thank you for visiting the App");
		System.out.println("Thank you for visiting the App");
		System.out.println("Thank you for visiting the App");
		System.out.println("Thank you for visiting the App");
		System.out.println("Thank you for visiting the App");
		System.out.println("Thank you for visiting the App");

	}
}
