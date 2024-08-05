package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.model.*;

public class StudentTest {

	private IStudentService studentService;
	private Student student;

	void init() {
		studentService = Mockito.mock(IStudentService.class);
		student = new Student(studentService);
	}

	@Test
	void testcalculatePercentage() {

		assertEquals(65, student.calculatePercentage());
	}

}
