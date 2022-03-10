package com.core_java_practice.control.statements;

public class SwitchDemoExample {
	public static void main(String[] args) {

		switch ("dummy") {
		/*
		 * case 1: System.out.println("You have selected 1"); break; case 2:
		 * System.out.println("You have selected 2"); break; case 3:
		 * System.out.println("You have selected 3"); break; case 4:
		 * System.out.println("You have selected 4"); break;
		 */

		case "fan":
			System.out.println("Fan is switched on");
			break;
		case "light":
			System.out.println("Light is switched on");
			break;

		default:
			System.out.println("Nothing is matching");
		}

	}

}
