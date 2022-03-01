package com.core_java_practice.datatypes;

public class IntegerDatatypeExamples {
	// non static variable
	int age = 26;
	int number_of_teeth = 32;
	int number_of_pens = 23;
	int number_of_chocolates = 13;

	// static variable
	static int age_ = 26;
	static int number_of_teeth_ = 32;
	static int number_of_pens_ = 23;
	static int number_of_chocolates_ = 13;

	// Datatypes am going thereqEQe

	// static member
	public static void main(String[] args) {

		/*
		 * System.out.println("hello Word");asjfhusdufhuhfiuaJFUIacasCSA
		 * vsadnjnsadgds gdsankdsasnka System.out.println("This is Java coder");
		 */

		IntegerDatatypeExamples integerDatatypeExamples = new IntegerDatatypeExamples();

		System.out.println("The value for age is :"
				+ integerDatatypeExamples.age);
		System.out.println("The value for number_of_teeth is :"
				+ integerDatatypeExamples.number_of_teeth);
		System.out.println("The value for number_of_pens is :"
				+ integerDatatypeExamples.number_of_pens);
		System.out.println("The value for number_of_chocolates is :"
				+ integerDatatypeExamples.number_of_chocolates);

		System.out
				.println("-------------------------------------- accessing variable name usinf class name");
		System.out.println("The value for age_ is :"
				+ IntegerDatatypeExamples.age_);

		System.out.println("The value for number_of_teeth is :"
				+ IntegerDatatypeExamples.number_of_teeth_);
		System.out.println("The value for number_of_pens is :"
				+ IntegerDatatypeExamples.number_of_pens_);
		System.out.println("The value for number_of_chocolates is :"
				+ IntegerDatatypeExamples.number_of_chocolates_);

		System.out
				.println("-------------------------------------- accessing variables names using direct variable name");
		System.out.println("The value for age_ is :" + age_);

		System.out.println("The value for number_of_teeth is :"
				+ number_of_teeth_);
		System.out.println("The value for number_of_pens is :"
				+ number_of_pens_);
		System.out.println("The value for number_of_chocolates is :"
				+ number_of_chocolates_);

	}

}
