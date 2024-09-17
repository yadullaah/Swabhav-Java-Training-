package com.training;

import java.util.Comparator;

public class StudentComparator {
	
	public static class NameComparator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			
			return student1.getName().compareTo(student2.getName());
		}
		

	}
	public static class RollNumberComparator implements Comparator<Student> {

		@Override
		public int compare(Student student1, Student student2) {
			
//			if(student1.getRollNumber()>student2.getRollNumber())
//				return 1;
//			if(student1.getRollNumber()<student2.getRollNumber())
//				return -1;
			
			return student1.getRollNumber() - student2.getRollNumber();
		}

	}
	public static class PercentageComparator implements Comparator<Student> {
		@Override
		public int compare(Student student1, Student student2) {
			
			if(student1.getPercentage()>student2.getPercentage())
				return 1;
			if(student1.getPercentage()<student2.getPercentage())
				return -1;
			
			return 0;
		}

	}


}
