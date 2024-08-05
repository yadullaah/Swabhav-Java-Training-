package com.test;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

import com.training.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		List<Student> students= new ArrayList<Student>();
		
		students.add(new Student(1,"Yadullah", 90));
		students.add(new Student(2,"Suhas", 85));
		students.add(new Student(3,"Swabhav", 80));
		
		System.out.println();
		for (int i = 0; i<students.size();i++)
			System.out.println(students.get(i));
		
		System.out.println();
		for (Student student: students)
			System.out.println(student);
		
		System.out.println();
		Iterator<Student> studentIterator = students.iterator();
		while (studentIterator.hasNext())
			System.out.println(studentIterator.next());
		
		System.out.println();
		ListIterator<Student> studentListIterator=students.listIterator();
		while(studentListIterator.hasNext())
			System.out.println(studentListIterator.next());
		while(studentListIterator.hasPrevious())
			System.out.println(studentListIterator.previous());
		
		
		
	}

}
