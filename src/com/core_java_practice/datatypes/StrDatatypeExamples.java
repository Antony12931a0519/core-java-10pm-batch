package com.core_java_practice.datatypes;

public class StrDatatypeExamples {

	public static String first_name = "Raju";
	public String last_name = "Anthony";

	public static void main(String[] args) {

		StrDatatypeExamples strDatatypeExamples = new StrDatatypeExamples();
//statc variabe accessing
		System.out.println("First Name:" + strDatatypeExamples.first_name);
		System.out.println("First Name:" + first_name);
		System.out.println("First Name:" + StrDatatypeExamples.first_name);
		//non static variabe accessing
		System.out.println("Last Name:" + strDatatypeExamples.last_name);

	}

}
