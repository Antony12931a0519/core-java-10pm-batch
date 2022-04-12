package com.core_java_practice.arrays.examples.collections;

import java.util.ArrayList;
import java.util.List;

import com.core_java_practice.arrays.examples.School;
import com.core_java_practice.arrays.examples.Student;

public class ListWithUserDefindedType {

	public static void main(String[] args) {
		// user defined object
		// I want to store details of 10 students
		// String
		// all the keys works or classes given by java are predefined
		// List<String> students = null;
		List<Student> students = new ArrayList<Student>();//student type
		List<School> schols = new ArrayList<School>();
		List<Character> initials = new ArrayList<Character>();
		initials.add('a');
		List<String> names = new ArrayList<String>();
		names.add("bjfbjas");
		names.add("sdflnfi");
		
//		students.add("grg");
		
//		students.add(101);
		
//		students.add('A');
		
		
		/*Student student1 = new Student();
		student1.setAddress("AtKUR");
		student1.setInitial('g');
		student1.setName("skjnsnk");
		student1.setRollNumber(1293);
		
		students.add(student1);
		
		Student student2 = new Student();
		student2.setAddress("AtKUR");
		student2.setInitial('g');
		student2.setName("erwrewrew");
		student2.setRollNumber(1295);
		
		students.add(student2);
		
		
		Student student3 = new Student();
		student3.setAddress("AtKUR");
		student3.setInitial('g');
		student3.setName("skjfwefwefwnsnk");
		student3.setRollNumber(1294);
		
		students.add(student3);*/
		int size = 10;
		for (int i = 0; i < size; i++) {
			
			Student student = new Student();
			student.setAddress("AtKUR"+i);
			student.setInitial('g');
			student.setName("skjfwefwefwnsnk"+i);
			student.setRollNumber(i);
			students.add(student);
		}
		
		System.out.println(names);
		System.out.println(students);
		
		
		
		
		

	}

}
