package com.core_java_practice.arrays.examples.collections;

import java.util.HashSet;
import java.util.Set;

import com.core_java_practice.arrays.examples.Student;

public class SetWithUserDefinedExample {
	
	public static void main(String[] args) {
		
		Set<Student> students = new HashSet<Student>();
		
		
//		public String name;
//		public int rollNumber;
//		public String address;
//		public char initial;

		
		Student student = new Student();
		student.setAddress("sadsd");
		student.setName("sdd");
//		student.setInitial('sdf');
		student.setInitial('a');//this cleary say that you guys have no idea on dtatypes
		student.setRollNumber(12345);
		
		students.add(student);
		
		//try a program how to add user defined objects ito the ist and set
		
	}

}
