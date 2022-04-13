package com.core_java_practice.arrays.examples.collections;

import java.util.HashMap;
import java.util.Map;

import com.core_java_practice.arrays.examples.Student;

public class MapWithUserdefindedExample {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "kgnsskg");

		Map<String, Student> studentsmap = new HashMap<String, Student>();

		Student student = new Student();
		
		//try datypes examples
		//
		student.setAddress("sadsd");
		student.setName("sdd");
//		student.setInitial('sdf');
		student.setInitial('a');//this cleary say that you guys have no idea on dtatypes
		student.setRollNumber(12345);
		studentsmap.put("sjefeQ", student);
		
		System.out.println(studentsmap);
		
		

	}
}
