package com.core_java_practice.control.statements;

import java.util.Scanner;

public class VotingApplication {

	int age;
	String name;

	public void checkPersonIselibleForVoting(int age, String name) {

		if (age >= 18) {
			System.out.println(name + " is eligible for voting");
		} else {
			System.out.println(name + " is not eligible for voting");
		}

	}

	public static void main(String[] args) {

		VotingApplication votingApplication = new VotingApplication();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Whatis your name?");

		votingApplication.name = scanner.next();

		System.out.println("Please enter your age:");

		votingApplication.age = scanner.nextInt();

		System.out.println("Hello " + votingApplication.name
				+ " and your age is " + votingApplication.age);

		votingApplication.checkPersonIselibleForVoting(votingApplication.age,
				votingApplication.name);

	}

}
