package com.core_java_practice.arrays.examples;

public class UserDefindedObjecsArrayExample {

	static Student[] stundents = new Student[2];
	int[] marks = new int[3];
	String[] names = new String[3];
	Character[] marks1 = new Character[3];
	Float[] marks11 = new Float[3];
	Boolean[] marks111 = new Boolean[3];

	public static void main(String[] args) {
		
		

		Student st1 = new Student();
		st1.setAddress("hyderbad");
		st1.setInitial('a');
		st1.setName("ANuS");
		st1.setRollNumber(1234);
		stundents[0] = st1;

		Student st2 = new Student();
		st2.setAddress("mumbai");
		st2.setInitial('a');
		st2.setName("ANuS");
		st2.setRollNumber(1234);

		stundents[1] = st2;

		/*for (int i = 0; i <= stundents.length - 1; i++) {
			System.out.println(stundents[i]);
		}*/
		
		for(Student student: stundents){
			System.out.println(student.getAddress());
			System.out.println(student.getName());
			
		}
	}
}
