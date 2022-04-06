package com.core_java_practice.arrays.examples.exceptionhandling;

public class AtmOperations {
	public static void main(String[] args) throws Exception {
		int pin = 1234;
		if (pin == 1233) {
			System.out.println("Transaction is successfull");
		} else {
			System.out.println("Invalid Pin !Please try again");
			throw new Exception("You have entered invalid pin");
		}
		
		System.out.println("Thank you");
	}

}
