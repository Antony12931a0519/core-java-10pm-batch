package com.core_java_practice.arrays.examples;

public class UserDefindedObjecsArrayExample {

	static Student[] stundents  ;

	public static void main(String[] args) {
		
		

		Student st1 = new Student();
		st1.setAddress("f");
		st1.setInitial('a');
		st1.setName("ANuS");
		st1.setRollNumber(1234);
		stundents[0] = st1;

		Student st2 = new Student();
		st2.setAddress("f");
		st2.setInitial('a');
		st2.setName("ANuS");
		st2.setRollNumber(1234);

		stundents[1] = st2;

		for (int i = 0; i < stundents.length - 1; i++) {
			System.out.println(stundents[i]);
		}
	}

}
