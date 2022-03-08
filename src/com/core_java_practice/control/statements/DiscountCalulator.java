package com.core_java_practice.control.statements;

import java.util.Scanner;

public class DiscountCalulator {
	// non static method
	//nested if else
	//nested if block
	//else if
	public int discountCalculator(long totaBillAmount) {
		if (totaBillAmount >= 500 && totaBillAmount <= 5000) {
			return 50;
		} else if (totaBillAmount >= 5000 && totaBillAmount <= 10000) {
			return 100;
		} else if (totaBillAmount >= 15000 && totaBillAmount <= 30000) {
			return 1000;
		} else if (totaBillAmount >= 40000) {
			return 4000;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {

		System.out.println("Billing details");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cusomer Name");
		String name = scanner.next();
		System.out.println("Enter the bill amount");
		long totalBillAmount = scanner.nextLong();

		DiscountCalulator ref = new DiscountCalulator();

		System.out.println("Discount received:"
				+ ref.discountCalculator(totalBillAmount));

	}

}
