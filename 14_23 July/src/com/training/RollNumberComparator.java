package com.training;

import java.util.Comparator;

public class RollNumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		
//		if(student1.getRollNumber()>student2.getRollNumber())
//			return 1;
//		if(student1.getRollNumber()<student2.getRollNumber())
//			return -1;
		
		return student1.getRollNumber() - student2.getRollNumber();
	}

}
