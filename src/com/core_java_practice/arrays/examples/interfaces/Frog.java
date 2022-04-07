package com.core_java_practice.arrays.examples.interfaces;

public class Frog extends Animal {
	
	public void type() {

		System.out.println("carnivorous");
	}


	@Override
	public void makeSound() {

		System.out.println("Bak Bak");
	}

	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.makeSound();
		Animal animal = new Animal();
		animal.makeSound();
		
		
	}

}
