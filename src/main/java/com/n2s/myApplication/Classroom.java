package com.n2s.myApplication;

import java.util.ArrayList;
import java.util.List;

import com.janani.interfacelearn.Calculator;
import com.n2s.assignments.Student;

public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> stu = new ArrayList<Student>();

		Calculator c = new Calculator();

		Student diya = new Student();
		diya.setName("Diya");
		// diya.setCourse("java");
		diya.setAddress("mineral dr");
		Student priya = new Student();
		priya.setName("Priya");
		priya.setCourse("c++");
		priya.setAddress("Echo park");
		Student janani = new Student();
		janani.setName("Janani");
		// janani.setCourse("java");
		janani.setAddress("Roaring river");
		stu.add(diya);
		stu.add(priya);
		stu.add(janani);

		for (int i = 0; i < stu.size(); i++) {
			Student s = stu.get(i);
			System.out.println(
					"Name:" + s.getName() + "   " + "Course:" + s.getCourse() + "   " + "Adress:" + s.getAddress());

		}
	}

}
