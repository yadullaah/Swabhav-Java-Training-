package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import com.training.RollNumberComparator;
//import com.training.NameComparator;
//import com.training.PercentageComparator;
import com.training.Student;
import com.training.StudentComparator;

public class StudentTest {
	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();

		students.add(new Student(5, "Subodh", 65));
		students.add(new Student(1, "Yadullah", 90));
		students.add(new Student(4, "Shubham", 70));
		students.add(new Student(2, "Suhas", 85));
		students.add(new Student(3, "Swabhav", 75));

		System.out.println("Students not sorted");
		printStudents(students);

		System.out.println();

		System.out.println("Students sorted according to roll number");
		Collections.sort(students, new StudentComparator.RollNumberComparator());
		printStudents(students);

		System.out.println();

		System.out.println("Students sorted according to percentage");
		Collections.sort(students, new StudentComparator.PercentageComparator());
		printStudents(students);

		System.out.println();

		System.out.println("Students sorted according to name");
		Collections.sort(students, new StudentComparator.NameComparator());
		printStudents(students);

	}

	private static void printStudents(List<Student> students) {

		for (Student student : students)
			System.out.println(student);
	}

}
