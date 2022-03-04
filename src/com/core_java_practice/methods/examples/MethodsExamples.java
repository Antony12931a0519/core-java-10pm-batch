package com.core_java_practice.methods.examples;

public class MethodsExamples {

	// 1-o //2-o //3-m //4-m //5-o
	public static void mainsfef(String[] args) {
		// 6-m
	}

	int age = 10;

	public static void main(String[] args) {
		// object creation
		MethodsExamples methodsExamples = new MethodsExamples();

		methodsExamples.welcomMessage();

	}

	 void welcomMessage() {

		System.out.println(age);
		System.out.println("Good Morning");
		System.out.print("Good Morning");
		System.out.print("Good Morning");
		welcomMessage2();

	}
	
	void welcomMessage2() {

		System.out.println(age);
		System.out.println("Good Morning");
		System.out.print("Good Morning");
		System.out.print("Good Morning");

	}

	static void printAge() {
		MethodsExamples ref = new MethodsExamples();

		System.out.println(ref.age);

	}

}
