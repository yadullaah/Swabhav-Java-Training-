package com.assignment.test;

import com.assignment.model.StudentPrototype;;


// Client
public class StudentTest {
    public static void main(String[] args) {
        StudentPrototype student1 = new StudentPrototype(1, "John Doe", "A");
        System.out.println("Original Student: " + student1);

        StudentPrototype student2 = (StudentPrototype) student1.clone();
        student2.setName("Jane Doe");
        student2.setId(2);
        student2.setGrade("B");
        System.out.println("Cloned Student: " + student2);
    }
}


