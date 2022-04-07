package com.core_java_practice.arrays.examples.interfaces;

public class Dog extends Animal {
	
	public void type() {

		System.out.println("carnivorous");
	}


	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();
	}

}
