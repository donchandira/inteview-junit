package com.chandira.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.chandira.entity.Student;

public class MySet {

	public static void main(String[] args) {

		
		ArrayList<Student> studentList = new ArrayList<>();
		ArrayList<Student> studentList1 = new ArrayList<>();
		Set<ArrayList<Student>> group = new HashSet<>();
		
		// Group 1
		studentList.add(new Student(1, "Chandira"));
		studentList.add(new Student(2, "Hasini"));
		studentList.add(new Student(3, "Mango"));
		
		group.add(studentList);
		
		// Group 1
		studentList1.add(new Student(1, "Chandira"));
		studentList1.add(new Student(2, "Hasini"));
		studentList1.add(new Student(3, "Mango"));
		
		
		group.add(studentList1);
		
		System.out.println(group.size());

		System.out.println(group);
	}

}
